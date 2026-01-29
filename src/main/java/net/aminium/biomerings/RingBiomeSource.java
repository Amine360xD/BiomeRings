package net.aminium.biomerings;

import java.util.stream.Stream;

import com.mojang.serialization.Codec;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Climate.Sampler;

public class RingBiomeSource extends BiomeSource {

    @Override
    protected Codec<? extends BiomeSource> codec() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Stream<Holder<Biome>> collectPossibleBiomes() {
       throw new UnsupportedOperationException();
    }

    @Override
    public Holder<Biome> getNoiseBiome(int pX, int pY, int pZ, Sampler pSampler) {
        throw new UnsupportedOperationException();
    }
}
