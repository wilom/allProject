package com.wilom.data_karyawan;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.Test;

public class InputKaryawanTest extends TestCase {

    public int testHitungGaji() throws Exception {
    int a=250000;int b=2000000;int c=0;
        c=a+b;
        if(c!=2250000){

            Assert.assertTrue("SALAH", false);

        }else if(c==2250000){
            Assert.assertTrue("BENAR", true);
        }

        return c;
    }
}