package info.tritusk.textbook.salmonite.neoforge;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class SalmoniteClientStuff implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        var id = ResourceLocation.tryBuild("salmonite", "salmonite");
        var block = Registry.BLOCK.get(id);
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
    }
}