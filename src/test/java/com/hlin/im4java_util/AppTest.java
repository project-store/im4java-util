package com.hlin.im4java_util;

import java.util.List;

import org.junit.Test;

import com.hlin.im4java.util.ImageUtil;

/**
 * Unit test for simple App.
 */
public class AppTest {

    static String path = "C:\\Users\\Administrator\\Desktop\\testimage\\5854_1458818065901_H8dG3wkP.png";

    @Test
    public void test_getImageInfo() {

        System.out.println(ImageUtil.getImageInfo(path));
    }

    @Test
    public void test_addTextMark() throws Exception {

        ImageUtil.addTextWatermark(path, path, "bbbbb");
    }

    @Test
    public void test_addImgMark() throws Exception {

        ImageUtil.addImgWatermark(path, path, 100);
    }

    @Test
    public void test_resize() throws Exception {

        // ImageUtil.resize(path, path, 256, 256, 30d, false);
        ImageUtil.jdkResize(path, 0.3f);
    }

    @Test
    public void test_removeProfile() throws Exception {

        ImageUtil.removeProfile(path, path);
    }

    @Test
    public void test_scaleResizeImage() throws Exception {

        ImageUtil.scaleResize(path, path, 256, null);
    }

    @Test
    public void test_cropImage() throws Exception {

        ImageUtil.crop(path, path, 0, 100, 400, 400);
    }

    @Test
    public void test_subsectionImage() throws Exception {

        List<String> list = ImageUtil.subsection(path, path, 200, 200);
        System.out.println(list);
    }

    @Test
    public void test_rotate() throws Exception {

        ImageUtil.rotate(path, path, 10d);
    }

}
