/**
 * Created by theXuser on 27/11/2016.
 */

package com.geekdos.tps.TP1.Exercice2.Anwsar2;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class Blur implements Filters {

    private final float[] BLUR = {
            1f / 9f, 1f / 9f, 1f / 9f,
            1f / 9f, 1f / 9f, 1f / 9f,
            1f / 9f, 1f / 9f, 1f / 9f
    };

    @Override
    public BufferedImage aplyFilter(BufferedImage src) {
        Kernel kernel = new Kernel(3, 3, BLUR);
        ConvolveOp op = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);

        return op.filter(src, null);
    }
}
