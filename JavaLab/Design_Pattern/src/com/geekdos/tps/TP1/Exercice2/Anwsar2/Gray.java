/**
 * Created by theXuser on 27/11/2016.
 */

package com.geekdos.tps.TP1.Exercice2.Anwsar2;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;

public class Gray implements Filters {
    @Override
    public BufferedImage aplyFilter(BufferedImage src) {
        BufferedImageOp op = new ColorConvertOp(ColorSpace.getInstance(
                ColorSpace.CS_GRAY), null);

        return op.filter(src, null);
    }
}
