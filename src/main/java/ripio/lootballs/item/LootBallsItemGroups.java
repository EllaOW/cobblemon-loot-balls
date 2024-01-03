package ripio.lootballs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ripio.lootballs.Lootballs;

import static ripio.lootballs.block.LootBallsBlocks.*;

public class LootBallsItemGroups {
    public static final ItemGroup LOOTBALLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Lootballs.MOD_ID, "lootballs_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(POKE_LOOT_BALL))
                    .displayName(Text.translatable("itemGroup.lootballs.lootballs_group"))
                    .entries((displayContext, entries) -> {
                    entries.add(new ItemStack(AZURE_LOOT_BALL));
                    entries.add(new ItemStack(BEAST_LOOT_BALL));
                    entries.add(new ItemStack(CHERISH_LOOT_BALL));
                    entries.add(new ItemStack(CITRINE_LOOT_BALL));
                    entries.add(new ItemStack(DIVE_LOOT_BALL));
                    entries.add(new ItemStack(DREAM_LOOT_BALL));
                    entries.add(new ItemStack(DUSK_LOOT_BALL));
                    entries.add(new ItemStack(FAST_LOOT_BALL));
                    entries.add(new ItemStack(FRIEND_LOOT_BALL));
                    entries.add(new ItemStack(GREAT_LOOT_BALL));
                    entries.add(new ItemStack(HEAL_LOOT_BALL));
                    entries.add(new ItemStack(HEAVY_LOOT_BALL));
                    entries.add(new ItemStack(LEVEL_LOOT_BALL));
                    entries.add(new ItemStack(LOVE_LOOT_BALL));
                    entries.add(new ItemStack(LURE_LOOT_BALL));
                    entries.add(new ItemStack(LUXURY_LOOT_BALL));
                    entries.add(new ItemStack(MASTER_LOOT_BALL));
                    entries.add(new ItemStack(MOON_LOOT_BALL));
                    entries.add(new ItemStack(NEST_LOOT_BALL));
                    entries.add(new ItemStack(NET_LOOT_BALL));
                    entries.add(new ItemStack(PARK_LOOT_BALL));
                    entries.add(new ItemStack(POKE_LOOT_BALL));
                    entries.add(new ItemStack(PREMIER_LOOT_BALL));
                    entries.add(new ItemStack(QUICK_LOOT_BALL));
                    entries.add(new ItemStack(REPEAT_LOOT_BALL));
                    entries.add(new ItemStack(ROSEATE_LOOT_BALL));
                    entries.add(new ItemStack(SAFARI_LOOT_BALL));
                    entries.add(new ItemStack(SLATE_LOOT_BALL));
                    entries.add(new ItemStack(SPORT_LOOT_BALL));
                    entries.add(new ItemStack(TIMER_LOOT_BALL));
                    entries.add(new ItemStack(ULTRA_LOOT_BALL));
                    entries.add(new ItemStack(VERDANT_LOOT_BALL));
                }).build());

    public static void registerItemGroups() {
        Lootballs.LOGGER.info("Registering item groups for " + Lootballs.MOD_ID);
    }
}
