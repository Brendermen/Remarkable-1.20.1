package net.brendermen.remarkable.loot;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UnifiedLootModifier extends LootModifier {
    public static final Supplier<Codec<UnifiedLootModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst -> codecStart(inst)
                    .and(Codec.STRING.fieldOf("mode").forGetter(m -> m.mode))
                    .and(ItemEntry.CODEC.listOf().fieldOf("items").forGetter(m -> m.items))
                    .apply(inst, UnifiedLootModifier::new)
            )
    );

    private final String mode;
    private final List<ItemEntry> items;

    protected UnifiedLootModifier(LootItemCondition[] conditionsIn, String mode, List<ItemEntry> items) {
        super(conditionsIn);
        this.mode = mode;
        this.items = items;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if ("replace".equals(mode)) {
            generatedLoot.clear();
        }

        for (ItemEntry entry : items) {
            if (context.getRandom().nextFloat() <= entry.weight) {
                int finalCount = entry.count > 0 ? entry.count : entry.min + context.getRandom().nextInt(entry.max - entry.min + 1);
                generatedLoot.add(new ItemStack(entry.item, finalCount));
            }
        }

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }

    public static class ItemEntry {
        public static final Codec<ItemEntry> CODEC = RecordCodecBuilder.create(inst ->
                inst.group(
                        ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(e -> e.item),
                        Codec.INT.optionalFieldOf("min", 1).forGetter(e -> e.min),
                        Codec.INT.optionalFieldOf("max", 1).forGetter(e -> e.max),
                        Codec.INT.optionalFieldOf("count", 0).forGetter(e -> e.count),
                        Codec.FLOAT.optionalFieldOf("weight", 1.0f).forGetter(e -> e.weight)
                ).apply(inst, ItemEntry::new)
        );

        private final Item item;
        private final int min;
        private final int max;
        private final int count;
        private final float weight;

        public ItemEntry(Item item, int min, int max, int count, float weight) {
            this.item = item;
            this.min = min;
            this.max = max;
            this.count = count;
            this.weight = weight;
        }
    }
}


//Add a remove feature
//Add fortune
//Add silk touch