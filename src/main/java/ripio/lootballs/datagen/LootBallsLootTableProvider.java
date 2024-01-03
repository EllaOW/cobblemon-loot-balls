package ripio.lootballs.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import ripio.lootballs.Lootballs;

import java.util.function.BiConsumer;

public class LootBallsLootTableProvider extends SimpleFabricLootTableProvider {
    public static final Identifier POKE_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "poke_loot_table");

    public static final Identifier CITRINE_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "citrine_loot_table");

    public static final Identifier VERDANT_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "verdant_loot_table");

    public static final Identifier AZURE_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "azure_loot_table");

    public static final Identifier ROSEATE_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "roseate_loot_table");

    public static final Identifier SLATE_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "slate_loot_table");

    public static final Identifier PREMIER_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "premier_loot_table");

    public static final Identifier SAFARI_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "safari_loot_table");

    public static final Identifier GREAT_LOOT_TABLE = new Identifier(Lootballs.MOD_ID, "great_loot_table");

    public LootBallsLootTableProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, LootContextTypes.CHEST);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> biConsumer) {
        biConsumer.accept(AZURE_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.AZURE_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );

        biConsumer.accept(CITRINE_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.CITRINE_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );

        biConsumer.accept(POKE_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.POKE_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );

        biConsumer.accept(PREMIER_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.PREMIER_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );

        biConsumer.accept(ROSEATE_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ROSEATE_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );
        biConsumer.accept(SLATE_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.SLATE_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );
        biConsumer.accept(VERDANT_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.VERDANT_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.HEAL_POWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(Items.EMERALD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,8.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LEFTOVERS)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );

        biConsumer.accept(SAFARI_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.SAFARI_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.NANAB_BERRY)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.PINAP_BERRY)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.RAZZ_BERRY)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.SUN_STONE)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.EXPERIENCE_CANDY_S)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.LUCKY_EGG)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );
        biConsumer.accept(GREAT_LOOT_TABLE, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(CobblemonItems.SUPER_POTION)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.MAX_ETHER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(30)
                        )
                        .with(ItemEntry.builder(CobblemonItems.REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,4.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.ELIXIR)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.GREAT_BALL)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(10)
                        )
                        .with(ItemEntry.builder(CobblemonItems.MAX_REVIVE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F,2.0F)))
                                .weight(5)
                        )
                        .with(ItemEntry.builder(CobblemonItems.EXPERIENCE_CANDY_M)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(4)
                        )
                        .with(ItemEntry.builder(CobblemonItems.QUICK_CLAW)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                                .weight(1)
                        )
                )
        );

    }
}
