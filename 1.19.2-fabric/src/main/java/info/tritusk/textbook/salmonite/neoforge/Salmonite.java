package info.tritusk.textbook.salmonite.neoforge;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Salmonite implements ModInitializer {

    @Override
    public void onInitialize() {
        var id = ResourceLocation.tryBuild("salmonite", "salmonite");
        var block = Registry.register(Registry.BLOCK, id, new DropExperienceBlock(BlockBehaviour.Properties
                .copy(Blocks.COAL_ORE)
                .requiresCorrectToolForDrops()
                .strength(3.0F, 3.0F), UniformInt.of(0, 2)));
        Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Properties()));
    }
}
