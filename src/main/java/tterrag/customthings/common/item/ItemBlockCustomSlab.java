package tterrag.customthings.common.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

import tterrag.customthings.common.block.BlockCustomSlab;
import tterrag.customthings.common.config.json.BlockType;

public class ItemBlockCustomSlab extends ItemSlab implements ICustomItem<BlockType> {

    public ItemBlockCustomSlab(Block slab, Boolean doubleslab) {
        super(slab, (BlockCustomSlab) slab, ((BlockCustomSlab) slab).doubleslab, doubleslab);
    }

    @Override
    public BlockType getType(ItemStack stack) {
        return ((BlockCustomSlab) field_150939_a).getType(stack);
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return getType(stack).maxStackSize;
    }
}
