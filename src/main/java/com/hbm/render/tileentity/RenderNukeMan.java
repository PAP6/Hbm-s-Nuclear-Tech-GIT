package com.hbm.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.hbm.lib.RefStrings;
import com.hbm.render.amlfrom1710.AdvancedModelLoader;
import com.hbm.render.amlfrom1710.IModelCustom;
import com.hbm.tileentity.bomb.TileEntityNukeMan;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderNukeMan extends TileEntitySpecialRenderer<TileEntityNukeMan> {

	private static final ResourceLocation objTesterModelRL = new ResourceLocation(/*"/assets/" + */RefStrings.MODID, "models/FatMan.obj");
	private IModelCustom manModel;
    private ResourceLocation manTexture;
	
	public RenderNukeMan()
    {
		manModel = AdvancedModelLoader.loadModel(objTesterModelRL);
		manTexture = new ResourceLocation(RefStrings.MODID, "textures/models/FatMan.png");
    }
	
	@Override
	public void render(TileEntityNukeMan te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y, z + 0.5D);
        GlStateManager.enableLighting();
        GL11.glDisable(GL11.GL_CULL_FACE);
		switch(te.getBlockMetadata())
		{
		case 3:
			GL11.glRotatef(90, 0F, 1F, 0F); break;
		case 5:
			GL11.glRotatef(180, 0F, 1F, 0F); break;
		case 2:
			GL11.glRotatef(270, 0F, 1F, 0F); break;
		case 4:
			GL11.glRotatef(0, 0F, 1F, 0F); break;
		}

        bindTexture(manTexture);
        manModel.renderAll();
        
        GlStateManager.enableLighting();

        GL11.glPopMatrix();
	}
}