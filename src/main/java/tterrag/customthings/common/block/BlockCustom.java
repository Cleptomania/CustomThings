package tterrag.customthings.common.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import lombok.experimental.Delegate;
import tterrag.customthings.common.config.json.BlockType.BlockData;

public class BlockCustom extends Block implements IBlockCustom {

    private final BlockProxy<BlockCustom> proxy;

    @Delegate
    private BlockProxy<BlockCustom> getProxy() {
        return proxy == null ? BlockProxy.<BlockCustom>dummy() : proxy;
    }

    public BlockCustom(BlockData data) {
        super(data.getType().material);
        setStepSound(data.getType().sound);
        this.proxy = new BlockProxy<BlockCustom>(this, data, 16);
        setHardness(0.3f);
        setResistance(0.5f);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public boolean func_149730_j() {
        return isOpaqueCube();
    }
}
