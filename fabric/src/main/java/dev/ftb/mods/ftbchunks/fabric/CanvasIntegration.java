package dev.ftb.mods.ftbchunks.fabric;

import dev.ftb.mods.ftbchunks.client.FTBChunksClient;
import grondag.frex.api.event.RenderRegionBakeListener;

public class CanvasIntegration {
	public static void init() {
		RenderRegionBakeListener.register(context -> true, CanvasIntegration::bake);
	}

	private static void bake(RenderRegionBakeListener.RenderRegionContext context, RenderRegionBakeListener.BlockStateRenderer blockStateRenderer) {
		FTBChunksClient.rerender(context.origin());
	}
}
