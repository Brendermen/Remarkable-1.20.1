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

public class ReplaceItemModifier extends LootModifier {
    public static final Supplier<Codec<ReplaceItemModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst -> codecStart(inst)
                    .and(ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(m -> m.item))
                    .and(Codec.INT.fieldOf("countMin").forGetter(m -> m.countMin))
                    .and(Codec.INT.fieldOf("countMax").forGetter(m -> m.countMax))
                    .apply(inst, ReplaceItemModifier::new)));

    private final Item item;
    private final int countMin;
    private final int countMax;

    protected ReplaceItemModifier(LootItemCondition[] conditionsIn, Item item, int countMin, int countMax) {
        super(conditionsIn);
        this.item = item;
        this.countMin = countMin;
        this.countMax = countMax;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.clear(); // Remove the original item
        int count = countMin + context.getRandom().nextInt(countMax - countMin + 1); // Generates random count between countMin and countMax
        generatedLoot.add(new ItemStack(item, count)); // Add specified item with calculated count

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
