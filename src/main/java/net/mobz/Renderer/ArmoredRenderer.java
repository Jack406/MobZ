package net.mobz.Renderer;

import net.mobz.Entity.*;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.feature.ArmorBipedFeatureRenderer;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)

public class ArmoredRenderer extends BipedEntityRenderer<ArmoredEntity, ZombieEntityModel<ArmoredEntity>> {

    public ArmoredRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new ZombieEntityModel<>(), 0.5F);
        this.addFeature(new ArmorBipedFeatureRenderer(this, new ZombieEntityModel(0.5F, true),
                new ZombieEntityModel(1.0F, true)));

    }

    @Override
    protected Identifier getTexture(ArmoredEntity armoredEntity) {
        return new Identifier("mobz:textures/entity/armored.png");
    }

}