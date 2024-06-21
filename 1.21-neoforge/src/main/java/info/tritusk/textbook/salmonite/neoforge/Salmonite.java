package info.tritusk.textbook.salmonite.neoforge;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod("salmonite")
public class Salmonite {
    static final DeferredRegister<Block> BLOCKS = DeferredRegister.Blocks.createBlocks("salmonite");
    static final DeferredHolder<Block, Block> SALMONITE = BLOCKS.register("salmonite",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties
                    .ofFullCopy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)));
    static final DeferredRegister<Item> ITEMS = DeferredRegister.Items.createItems("salmonite");
    static final DeferredHolder<Item, Item> SALMONITE_ITEM = ITEMS.register("salmonite", () -> new BlockItem(SALMONITE.get(), new Item.Properties()));
    public Salmonite(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

}
