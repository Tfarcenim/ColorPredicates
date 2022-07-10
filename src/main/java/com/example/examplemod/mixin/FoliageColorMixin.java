package com.example.examplemod.mixin;

import net.minecraft.world.FoliageColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FoliageColors.class)
public class FoliageColorMixin {

    @Inject(method = "get",at = @At("HEAD"),cancellable = true)
    private static void white(double temperature, double humidity, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0xffffff);
    }

    @Inject(method = {"getBirch","getDefault","getSpruce"},at = @At("HEAD"),cancellable = true)
    private static void white(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0xffffff);
    }
}
