package name.k1imc0d3.polycontent.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import name.k1imc0d3.polycontent.Polycontent;
import name.k1imc0d3.polycontent.Block.ModBlocks;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {
    public static final Item CHAINMAIL = registerItem("chainmail", new Item(new Item.Settings()));
    public static final Item GOLDEN_CHAIN = Registry.register(Registries.ITEM, Identifier.of(Polycontent.MODID, "golden_chain"),new BlockItem(ModBlocks.GOLDEN_CHAIN, new Item.Settings()));
    public static final Item GOLDEN_LANTERN = Registry.register(Registries.ITEM, Identifier.of(Polycontent.MODID, "golden_lantern"), new BlockItem(ModBlocks.GOLDEN_LANTERN, new Item.Settings()));
    public static final Item SWEET_BERRY_BLOCK = Registry.register(Registries.ITEM, Identifier.of(Polycontent.MODID, "sweet_berry_block"), new BlockItem(ModBlocks.SWEET_BERRY_BLOCK, new Item.Settings()));
    public static final Item SWEET_BERRY_PIE = registerItem("sweet_berry_pie", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(9)
                    .saturationModifier(3.35f)
                    .build()
            )
    ));
    public static final Item COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(1f)
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.POISON, 170,1),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.HUNGER, 240, 2),
                            1.0f
                    )
                    .build()
            )
    ));
    public static final Item ENCHANTED_GOLDEN_CARROT = registerItem("enchanted_golden_carrot", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(6)
                    .saturationModifier(14.4f)
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.ABSORPTION, 3400,3),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.REGENERATION, 1700, 2),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5200, 2),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 5200, 2),
                            1.0f
                    )
                    .build())
            .rarity(Rarity.EPIC)
            ) {
                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }
            }
    );
    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(0.533f)
                    .build()
            )
    ));
    public static final Item GOLDEN_PUMPKIN_SLICE = registerItem("golden_pumpkin_slice", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(2.132f)
                    .build()
            )
    ));
    public static final Item ENCHANTED_GOLDEN_PUMPKIN_SLICE = registerItem("enchanted_golden_pumpkin_slice", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(2.132f)
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.ABSORPTION, 4100, 3), 1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 2), 1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.SATURATION, 4200, 1), 1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 4200, 1), 1.0f
                    )
                    .build()
            )
            .rarity(Rarity.EPIC)
            ) {
                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }
            }
    );
    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(4.8f)
                    .build()
            )
    ));
    public static final Item ENCHANTED_GOLDEN_BEETROOT = registerItem("enchanted_golden_beetroot", new Item(new Item.Settings()
                    .food(new FoodComponent.Builder()
                            .nutrition(1)
                            .saturationModifier(4.8f)
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 3880,2),
                                    1.0f
                            )
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 3880, 1),
                                    1.0f
                            )
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.SPEED, 3880, 3),
                                    1.0f
                            )
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 3880, 3),
                                    1.0f
                            )
                            .build()
                    )
                    .rarity(Rarity.EPIC)
            ) {
                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }
            }
    );
    public static final Item GOLDEN_BEETROOT_SOUP = registerItem("golden_beetroot_soup", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(6)
                    .saturationModifier(28.8f)
                    .build()
            )
    ));
    public static final Item ENCHANTED_GOLDEN_BEETROOT_SOUP = registerItem("enchanted_golden_beetroot_soup", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(28.8f)
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.ABSORPTION, 23280,3),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.REGENERATION, 23280, 2),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.STRENGTH, 23280, 4),
                            1.0f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 23280, 4),
                            1.0f
                    )
                    .build()
            )
            .rarity(Rarity.EPIC)
            ) {
                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }
            }
    );
    public static final Item INFINITY_ENCHANTED_GOLDEN_BETRICO = registerItem("infinity_enchanted_golden_betrico", new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.ABSORPTION, -1,0),
                            0.1428571429f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.REGENERATION, -1, 0),
                            0.1428571429f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0),
                            0.1428571429f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.RESISTANCE, -1, 0),
                            0.1428571429f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.SPEED, -1, 0),
                            0.1428571429f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.SATURATION, -1, 0),
                            0.1428571429f
                    )
                    .statusEffect(
                            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0),
                            0.1428571429f
                    )
                    .build()
            )
            .rarity(Rarity.EPIC)
            )
    );
    public static final Item ENCHANTS_TEMPLATE = registerItem("enchants_template", new Item(new Item.Settings()));
    public static final Item EXPERIENCE_BUCKET = registerItem("experience_bucket", new Item(new Item.Settings()
                    .rarity(Rarity.UNCOMMON)
            ) {
                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }
            }
    );
    public static Item registerItem(String name, Item item) {
        if (name == "experience_bucket" || name == "enchants_template" || name == "chainmail") {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{entries.add(item);});
        } else {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{entries.add(item);});
        }
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{entries.add(SWEET_BERRY_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{entries.add(GOLDEN_CHAIN);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{entries.add(GOLDEN_LANTERN);});
        return Registry.register(Registries.ITEM, Identifier.of(Polycontent.MODID, name), item);
    }
    public static void registerModItems() {

    }
}
