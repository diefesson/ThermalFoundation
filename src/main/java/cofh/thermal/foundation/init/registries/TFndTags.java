package cofh.thermal.foundation.init.registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;

public class TFndTags {

    private TFndTags() {

    }

    public static class Blocks {

        public static final TagKey<Block> ORES_APATITE = commonTag("ores/apatite");
        public static final TagKey<Block> ORES_CINNABAR = commonTag("ores/cinnabar");
        public static final TagKey<Block> ORES_LEAD = commonTag("ores/lead");
        public static final TagKey<Block> ORES_NICKEL = commonTag("ores/nickel");
        public static final TagKey<Block> ORES_NITER = commonTag("ores/niter");
        public static final TagKey<Block> ORES_RUBY = commonTag("ores/ruby");
        public static final TagKey<Block> ORES_SAPPHIRE = commonTag("ores/sapphire");
        public static final TagKey<Block> ORES_SILVER = commonTag("ores/silver");
        public static final TagKey<Block> ORES_SULFUR = commonTag("ores/sulfur");
        public static final TagKey<Block> ORES_TIN = commonTag("ores/tin");

        public static final TagKey<Block> STORAGE_BLOCKS_APATITE = commonTag("storage_blocks/apatite");
        public static final TagKey<Block> STORAGE_BLOCKS_BRONZE = commonTag("storage_blocks/bronze");
        public static final TagKey<Block> STORAGE_BLOCKS_CINNABAR = commonTag("storage_blocks/cinnabar");
        public static final TagKey<Block> STORAGE_BLOCKS_CONSTANTAN = commonTag("storage_blocks/constantan");
        public static final TagKey<Block> STORAGE_BLOCKS_ELECTRUM = commonTag("storage_blocks/electrum");
        public static final TagKey<Block> STORAGE_BLOCKS_INVAR = commonTag("storage_blocks/invar");
        public static final TagKey<Block> STORAGE_BLOCKS_LEAD = commonTag("storage_blocks/lead");
        public static final TagKey<Block> STORAGE_BLOCKS_NICKEL = commonTag("storage_blocks/nickel");
        public static final TagKey<Block> STORAGE_BLOCKS_NITER = commonTag("storage_blocks/niter");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_LEAD = commonTag("storage_blocks/raw_lead");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_NICKEL = commonTag("storage_blocks/raw_nickel");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_SILVER = commonTag("storage_blocks/raw_silver");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_TIN = commonTag("storage_blocks/raw_tin");
        public static final TagKey<Block> STORAGE_BLOCKS_RUBY = commonTag("storage_blocks/ruby");
        public static final TagKey<Block> STORAGE_BLOCKS_SAPPHIRE = commonTag("storage_blocks/sapphire");
        public static final TagKey<Block> STORAGE_BLOCKS_SILVER = commonTag("storage_blocks/silver");
        public static final TagKey<Block> STORAGE_BLOCKS_SULFUR = commonTag("storage_blocks/sulfur");
        public static final TagKey<Block> STORAGE_BLOCKS_TIN = commonTag("storage_blocks/tin");

        // region HELPERS
        private static TagKey<Block> thermalTag(String name) {

            return BlockTags.create(new ResourceLocation(ID_THERMAL, name));
        }

        private static TagKey<Block> commonTag(String name) {

            return BlockTags.create(new ResourceLocation("c", name));
        }
        // endregion
    }

    public class Items {

        public static final TagKey<Item> ORES_APATITE = commonTag("ores/apatite");
        public static final TagKey<Item> ORES_CINNABAR = commonTag("ores/cinnabar");
        public static final TagKey<Item> ORES_LEAD = commonTag("ores/lead");
        public static final TagKey<Item> ORES_NICKEL = commonTag("ores/nickel");
        public static final TagKey<Item> ORES_NITER = commonTag("ores/niter");
        public static final TagKey<Item> ORES_RUBY = commonTag("ores/ruby");
        public static final TagKey<Item> ORES_SAPPHIRE = commonTag("ores/sapphire");
        public static final TagKey<Item> ORES_SILVER = commonTag("ores/silver");
        public static final TagKey<Item> ORES_SULFUR = commonTag("ores/sulfur");
        public static final TagKey<Item> ORES_TIN = commonTag("ores/tin");

        public static final TagKey<Item> STORAGE_BLOCKS_BRONZE = commonTag("storage_blocks/bronze");
        public static final TagKey<Item> STORAGE_BLOCKS_CONSTANTAN = commonTag("storage_blocks/constantan");
        public static final TagKey<Item> STORAGE_BLOCKS_ELECTRUM = commonTag("storage_blocks/electrum");
        public static final TagKey<Item> STORAGE_BLOCKS_INVAR = commonTag("storage_blocks/invar");
        public static final TagKey<Item> STORAGE_BLOCKS_LEAD = commonTag("storage_blocks/lead");
        public static final TagKey<Item> STORAGE_BLOCKS_NICKEL = commonTag("storage_blocks/nickel");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_LEAD = commonTag("storage_blocks/raw_lead");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_NICKEL = commonTag("storage_blocks/raw_nickel");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_SILVER = commonTag("storage_blocks/raw_silver");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_TIN = commonTag("storage_blocks/raw_tin");
        public static final TagKey<Item> STORAGE_BLOCKS_RUBY = commonTag("storage_blocks/ruby");
        public static final TagKey<Item> STORAGE_BLOCKS_SAPPHIRE = commonTag("storage_blocks/sapphire");
        public static final TagKey<Item> STORAGE_BLOCKS_SILVER = commonTag("storage_blocks/silver");
        public static final TagKey<Item> STORAGE_BLOCKS_TIN = commonTag("storage_blocks/tin");

        // region HELPERS
        private static TagKey<Item> thermalTag(String name) {

            return ItemTags.create(new ResourceLocation(ID_THERMAL, name));
        }

        private static TagKey<Item> commonTag(String name) {

            return ItemTags.create(new ResourceLocation("c", name));
        }
        // endregion
    }

}
