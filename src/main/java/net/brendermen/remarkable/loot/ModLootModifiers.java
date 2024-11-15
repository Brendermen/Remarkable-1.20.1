package net.brendermen.remarkable.loot;

import com.mojang.serialization.Codec;
import net.brendermen.remarkable.Remarkable;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Remarkable.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> UNIFIED_LOOT_MODIFIER =
            LOOT_MODIFIER_SERIALIZERS.register("unified_loot_modifier", UnifiedLootModifier.CODEC);

    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
