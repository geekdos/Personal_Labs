/**
 * Created by theXuser on 26/11/2016.
 */

package Exercice2;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.*;

public class ImageOps {

    private ImageOps() {
    }

    public static BufferedImage blur(BufferedImage src) {
        Kernel kernel = new Kernel(3, 3, BLUR);
        ConvolveOp op = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
        return op.filter(src, null);
    }

    private static final float[] BLUR = {1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f};

    public static BufferedImage gray(BufferedImage src) {
        BufferedImageOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
        return op.filter(src, null);
    }

    public static BufferedImage rotate(BufferedImage src) {
        return rotate(src, Math.PI / 6);
    }

    public static BufferedImage rotate(BufferedImage src, double angle) {
        AffineTransform at = AffineTransform.getRotateInstance(angle);
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        BufferedImageOp op = new AffineTransformOp(at, hints);
        return op.filter(src, null);
    }
}
