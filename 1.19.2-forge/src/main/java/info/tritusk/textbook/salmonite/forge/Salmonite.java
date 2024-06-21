package info.tritusk.textbook.salmonite.forge;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("salmonite")
public class Salmonite {
    static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "salmonite");
    static final RegistryObject<Block> SALMONITE = BLOCKS.register("salmonite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F), UniformInt.of(0, 2)));
    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "salmonite");
    static final RegistryObject<Item> SALMONITE_ITEM = ITEMS.register("salmonite", () -> new BlockItem(SALMONITE.get(), new Item.Properties()));
    public Salmonite() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

}
