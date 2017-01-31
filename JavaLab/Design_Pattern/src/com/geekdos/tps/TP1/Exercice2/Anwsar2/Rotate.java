/**
 * Created by theXuser on 27/11/2016.
 */

package com.geekdos.tps.TP1.Exercice2.Anwsar2;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Rotate implements Filters {
    @Override
    public BufferedImage aplyFilter(BufferedImage src) {
        return rotate(src, Math.PI / 6);
    }

    public static BufferedImage rotate(BufferedImage src, double angle) {
        AffineTransform at = AffineTransform.getRotateInstance(angle);
        RenderingHints hints = new RenderingHints(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        BufferedImageOp op = new AffineTransformOp(at, hints);
        return op.filter(src, null);
    }
}
