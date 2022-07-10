package com.example.examplemod.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;
import net.minecraft.world.level.ColorResolver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BiomeColors.class)
public class BiomeColorsMixin {

    @Inject(method = "getBlockColor",at = @At("HEAD"),cancellable = true)
    private static void white(IBlockDisplayReader worldIn, BlockPos blockPosIn, ColorResolver colorResolverIn, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0xffffff);
    }
}
