package example;

import v1_16_1.net.minecraft.block.BaseBlock;

public class ExampleBlock extends BaseBlock {
    public ExampleBlock(Settings settings) {
        super(settings);
    }

    @Override
    public String getTranslationKey() {
        return "example.translation.key";
    }
}