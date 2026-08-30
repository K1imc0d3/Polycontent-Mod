package name.k1imc0d3.polycontent;

import net.fabricmc.api.ModInitializer;

import name.k1imc0d3.polycontent.Item.*;
import name.k1imc0d3.polycontent.Block.*;
import net.minecraft.util.Identifier;


public class Polycontent implements ModInitializer {
    public static final String MODID = "polycontent";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
    public static Identifier id(String path) {
        return Identifier.of(MODID, path);
    }
}
