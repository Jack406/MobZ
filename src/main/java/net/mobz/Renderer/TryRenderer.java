package net.mobz.Renderer;

import net.mobz.Entity.*;

import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.feature.ArmorBipedFeatureRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)

public class TryRenderer extends BipedEntityRenderer<Try, PlayerEntityModel<Try>> {

    public TryRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new PlayerEntityModel(0.0F, false), 0.5F);
        this.addFeature(new ArmorBipedFeatureRenderer(this, new PlayerEntityModel(0.5F, true),
                new PlayerEntityModel(1.0F, true)));
    }

    @Override
    protected Identifier getTexture(Try Trye) {
        return new Identifier("mobz:textures/entity/try.png");
    }
}