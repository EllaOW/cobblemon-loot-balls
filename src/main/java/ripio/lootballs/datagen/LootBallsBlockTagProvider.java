package ripio.lootballs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import ripio.lootballs.Lootballs;
import ripio.lootballs.block.LootBallsBlocks;

import java.util.concurrent.CompletableFuture;

public class LootBallsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> LOOT_BALLS_BASE_BLOCKS = TagKey.of(
            RegistryKeys.BLOCK,
            new Identifier(Lootballs.MOD_ID, "loot_balls_base_blocks")
    );

    public static final TagKey<Block> LOOT_BALLS_REPLACEABLES = TagKey.of(
            RegistryKeys.BLOCK,
            new Identifier(Lootballs.MOD_ID, "loot_balls_replaceables")
    );
    public static final TagKey<Block> LOOT_BALLS_BLOCKS = TagKey.of(
            RegistryKeys.BLOCK,
            new Identifier(Lootballs.MOD_ID, "loot_balls_blocks")
    );

    public LootBallsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(LOOT_BALLS_BASE_BLOCKS)
                .forceAddTag(BlockTags.BASE_STONE_OVERWORLD)
                .forceAddTag(BlockTags.DIRT)
                .forceAddTag(BlockTags.SAND)
                .forceAddTag(BlockTags.TERRACOTTA)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.SNOW)
                .forceAddTag(BlockTags.ICE)
                .forceAddTag(BlockTags.BASE_STONE_NETHER)
                .forceAddTag(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(Blocks.GRAVEL)
                .add(Blocks.SUSPICIOUS_GRAVEL)
                .add(Blocks.SANDSTONE)
                .add(Blocks.RED_SANDSTONE)
                .add(Blocks.CALCITE)
                .add(Blocks.END_STONE)
                .add(Blocks.END_STONE_BRICKS)
                .add(Blocks.PURPUR_BLOCK)
                .add(Blocks.NETHERRACK);

        getOrCreateTagBuilder(LOOT_BALLS_REPLACEABLES)
                .forceAddTag(BlockTags.REPLACEABLE_BY_TREES)
                .add(Blocks.AIR)
                .add(Blocks.BUBBLE_COLUMN)
                .add(Blocks.CAVE_AIR)
                .add(Blocks.FIRE)
                .add(Blocks.GRASS)
                .add(Blocks.SNOW)
                .add(Blocks.SOUL_FIRE)
                .add(Blocks.STRUCTURE_VOID)
                .add(Blocks.VOID_AIR);

        getOrCreateTagBuilder(LOOT_BALLS_BLOCKS)
                .add(LootBallsBlocks.AZURE_LOOT_BALL)
                .add(LootBallsBlocks.BEAST_LOOT_BALL)
                .add(LootBallsBlocks.CHERISH_LOOT_BALL)
                .add(LootBallsBlocks.CITRINE_LOOT_BALL)
                .add(LootBallsBlocks.DIVE_LOOT_BALL)
                .add(LootBallsBlocks.DREAM_LOOT_BALL)
                .add(LootBallsBlocks.DUSK_LOOT_BALL)
                .add(LootBallsBlocks.FAST_LOOT_BALL)
                .add(LootBallsBlocks.FRIEND_LOOT_BALL)
                .add(LootBallsBlocks.GREAT_LOOT_BALL)
                .add(LootBallsBlocks.HEAL_LOOT_BALL)
                .add(LootBallsBlocks.HEAVY_LOOT_BALL)
                .add(LootBallsBlocks.LEVEL_LOOT_BALL)
                .add(LootBallsBlocks.LOVE_LOOT_BALL)
                .add(LootBallsBlocks.LURE_LOOT_BALL)
                .add(LootBallsBlocks.LUXURY_LOOT_BALL)
                .add(LootBallsBlocks.MASTER_LOOT_BALL)
                .add(LootBallsBlocks.MOON_LOOT_BALL)
                .add(LootBallsBlocks.NEST_LOOT_BALL)
                .add(LootBallsBlocks.NET_LOOT_BALL)
                .add(LootBallsBlocks.PARK_LOOT_BALL)
                .add(LootBallsBlocks.POKE_LOOT_BALL)
                .add(LootBallsBlocks.PREMIER_LOOT_BALL)
                .add(LootBallsBlocks.QUICK_LOOT_BALL)
                .add(LootBallsBlocks.REPEAT_LOOT_BALL)
                .add(LootBallsBlocks.ROSEATE_LOOT_BALL)
                .add(LootBallsBlocks.SAFARI_LOOT_BALL)
                .add(LootBallsBlocks.SLATE_LOOT_BALL)
                .add(LootBallsBlocks.SPORT_LOOT_BALL)
                .add(LootBallsBlocks.TIMER_LOOT_BALL)
                .add(LootBallsBlocks.ULTRA_LOOT_BALL)
                .add(LootBallsBlocks.VERDANT_LOOT_BALL);
    }

}
