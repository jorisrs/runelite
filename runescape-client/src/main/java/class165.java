import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class165 {
   @ObfuscatedName("a")
   int[] field2330;
   @ObfuscatedName("i")
   int[] field2331;
   @ObfuscatedName("aj")
   static class231 field2332;
   @ObfuscatedName("w")
   byte[] field2333;

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(LIndexDataBase;LIndexDataBase;LIndexDataBase;I)V",
      garbageValue = "1010539738"
   )
   public static void method3060(IndexDataBase var0, IndexDataBase var1, IndexDataBase var2) {
      Sequence.field3617 = var0;
      Sequence.field3622 = var1;
      Sequence.field3607 = var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIIB)V",
      garbageValue = "-64"
   )
   public static void method3061(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method3061(var0, var1, var2, var5 - 1);
         method3061(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI[BIII)I",
      garbageValue = "1397863031"
   )
   public int method3062(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if(var5 == 0) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while(true) {
            byte var8 = var1[var7];
            if(var8 < 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            int var9;
            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 64) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 32) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 16) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 8) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 4) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 2) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 1) != 0) {
               var6 = this.field2330[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field2330[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            ++var7;
         }

         return var7 + 1 - var2;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "([BII[BII)I",
      garbageValue = "-1108092933"
   )
   public int method3065(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var6 = 0;
      int var7 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var8 = var1[var2] & 255;
         int var9 = this.field2331[var8];
         byte var10 = this.field2333[var8];
         if(var10 == 0) {
            throw new RuntimeException("");
         }

         int var11 = var7 >> 3;
         int var12 = var7 & 7;
         var6 &= -var12 >> 31;
         int var13 = var11 + (var10 + var12 - 1 >> 3);
         var12 += 24;
         var4[var11] = (byte)(var6 |= var9 >>> var12);
         if(var11 < var13) {
            ++var11;
            var12 -= 8;
            var4[var11] = (byte)(var6 = var9 >>> var12);
            if(var11 < var13) {
               ++var11;
               var12 -= 8;
               var4[var11] = (byte)(var6 = var9 >>> var12);
               if(var11 < var13) {
                  ++var11;
                  var12 -= 8;
                  var4[var11] = (byte)(var6 = var9 >>> var12);
                  if(var11 < var13) {
                     ++var11;
                     var12 -= 8;
                     var4[var11] = (byte)(var6 = var9 << -var12);
                  }
               }
            }
         }

         var7 += var10;
      }

      return (var7 + 7 >> 3) - var5;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(LPacketBuffer;I)I",
      garbageValue = "791560429"
   )
   static int method3070(PacketBuffer var0) {
      int var1 = var0.method3388(2);
      int var2;
      if(var1 == 0) {
         var2 = 0;
      } else if(var1 == 1) {
         var2 = var0.method3388(5);
      } else if(var1 == 2) {
         var2 = var0.method3388(8);
      } else {
         var2 = var0.method3388(11);
      }

      return var2;
   }

   public class165(byte[] var1) {
      int var2 = var1.length;
      this.field2331 = new int[var2];
      this.field2333 = var1;
      int[] var3 = new int[33];
      this.field2330 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if(var6 != 0) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field2331[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if((var8 & var7) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if(var11 != var8) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if((var11 & var12) != 0) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = var6 + 1; var10 <= 32; ++var10) {
               if(var3[var10] == var8) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if((var8 & var12) != 0) {
                  if(this.field2330[var10] == 0) {
                     this.field2330[var10] = var4;
                  }

                  var10 = this.field2330[var10];
               } else {
                  ++var10;
               }

               if(var10 >= this.field2330.length) {
                  int[] var13 = new int[this.field2330.length * 2];

                  for(int var14 = 0; var14 < this.field2330.length; ++var14) {
                     var13[var14] = this.field2330[var14];
                  }

                  this.field2330 = var13;
               }

               var12 >>>= 1;
            }

            this.field2330[var10] = ~var5;
            if(var10 >= var4) {
               var4 = var10 + 1;
            }
         }
      }

   }
}
