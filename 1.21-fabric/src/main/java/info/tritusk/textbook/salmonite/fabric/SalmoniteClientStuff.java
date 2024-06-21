package info.tritusk.textbook.salmonite.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class SalmoniteClientStuff implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        var id = ResourceLocation.fromNamespaceAndPath("salmonite", "salmonite");
        var block = BuiltInRegistries.BLOCK.get(id);
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
    }
}
