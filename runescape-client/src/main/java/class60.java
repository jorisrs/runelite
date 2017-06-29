import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public final class class60 {
   @ObfuscatedName("z")
   static Widget field766;
   @ObfuscatedName("ge")
   @ObfuscatedGetter(
      intValue = 1742632731
   )
   @Export("cameraZ")
   static int cameraZ;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "40"
   )
   public static int method1047() {
      return class50.keyboardIdleTicks;
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   @Export("load")
   static void load() {
      int var0;
      if(Client.loadingStage == 0) {
         class2.region = new Region(4, 104, 104, class61.tileHeights);

         for(var0 = 0; var0 < 4; ++var0) {
            Client.collisionMaps[var0] = new CollisionData(104, 104);
         }

         class59.field758 = new SpritePixels(512, 512);
         class92.loadingText = "Starting game engine...";
         class92.loadingBarPercentage = 5;
         Client.loadingStage = 20;
      } else {
         int var1;
         int var2;
         int var3;
         int var4;
         if(Client.loadingStage != 20) {
            if(Client.loadingStage == 30) {
               class44.indexInterfaces = RSCanvas.method811(0, false, true, true);
               class261.indexSoundEffects = RSCanvas.method811(1, false, true, true);
               class91.field1446 = RSCanvas.method811(2, true, false, true);
               class10.field259 = RSCanvas.method811(3, false, true, true);
               class98.field1545 = RSCanvas.method811(4, false, true, true);
               Frames.indexMaps = RSCanvas.method811(5, true, true, true);
               class44.indexTrack1 = RSCanvas.method811(6, true, true, false);
               class1.indexModels = RSCanvas.method811(7, false, true, true);
               class18.indexSprites = RSCanvas.method811(8, false, true, true);
               class87.indexTextures = RSCanvas.method811(9, false, true, true);
               DecorativeObject.field2194 = RSCanvas.method811(10, false, true, true);
               XGrandExchangeOffer.indexTrack2 = RSCanvas.method811(11, false, true, true);
               class169.indexScripts = RSCanvas.method811(12, false, true, true);
               RSCanvas.field693 = RSCanvas.method811(13, true, false, true);
               class12.field274 = RSCanvas.method811(14, false, true, false);
               class28.field424 = RSCanvas.method811(15, false, true, true);
               class61.indexWorldMap = RSCanvas.method811(16, false, true, false);
               class92.loadingText = "Connecting to update server";
               class92.loadingBarPercentage = 20;
               Client.loadingStage = 40;
            } else if(Client.loadingStage == 40) {
               byte var24 = 0;
               var0 = var24 + class44.indexInterfaces.method4216() * 4 / 100;
               var0 += class261.indexSoundEffects.method4216() * 4 / 100;
               var0 += class91.field1446.method4216() * 2 / 100;
               var0 += class10.field259.method4216() * 2 / 100;
               var0 += class98.field1545.method4216() * 6 / 100;
               var0 += Frames.indexMaps.method4216() * 4 / 100;
               var0 += class44.indexTrack1.method4216() * 2 / 100;
               var0 += class1.indexModels.method4216() * 58 / 100;
               var0 += class18.indexSprites.method4216() * 2 / 100;
               var0 += class87.indexTextures.method4216() * 2 / 100;
               var0 += DecorativeObject.field2194.method4216() * 2 / 100;
               var0 += XGrandExchangeOffer.indexTrack2.method4216() * 2 / 100;
               var0 += class169.indexScripts.method4216() * 2 / 100;
               var0 += RSCanvas.field693.method4216() * 2 / 100;
               var0 += class12.field274.method4216() * 2 / 100;
               var0 += class28.field424.method4216() * 2 / 100;
               var0 += class61.indexWorldMap.method4216() * 2 / 100;
               if(var0 != 100) {
                  if(var0 != 0) {
                     class92.loadingText = "Checking for updates - " + var0 + "%";
                  }

                  class92.loadingBarPercentage = 30;
               } else {
                  class92.loadingText = "Loaded update list";
                  class92.loadingBarPercentage = 30;
                  Client.loadingStage = 45;
               }
            } else if(Client.loadingStage == 45) {
               boolean var23 = !Client.field930;
               FileSystem.field3211 = 22050;
               class109.field1664 = var23;
               class109.field1647 = 2;
               class204 var28 = new class204();
               var28.method3675(9, 128);
               FrameMap.field2065 = class25.method166(GameEngine.field720, 0, 22050);
               FrameMap.field2065.method2021(var28);
               class33.method348(class28.field424, class12.field274, class98.field1545, var28);
               class59.field755 = class25.method166(GameEngine.field720, 1, 2048);
               class19.field328 = new class102();
               class59.field755.method2021(class19.field328);
               class225.field2896 = new class116(22050, FileSystem.field3211);
               class92.loadingText = "Prepared sound engine";
               class92.loadingBarPercentage = 35;
               Client.loadingStage = 50;
               XGrandExchangeOffer.field313 = new class262(class18.indexSprites, RSCanvas.field693);
            } else if(Client.loadingStage == 50) {
               class261[] var29 = new class261[]{class261.field3629, class261.field3628, class261.field3624, class261.field3634, class261.field3635, class261.field3633};
               var1 = var29.length;
               class262 var30 = XGrandExchangeOffer.field313;
               class261[] var31 = new class261[]{class261.field3629, class261.field3628, class261.field3624, class261.field3634, class261.field3635, class261.field3633};
               Client.field1134 = var30.method4737(var31);
               if(Client.field1134.size() < var1) {
                  class92.loadingText = "Loading fonts - " + Client.field1134.size() * 100 / var1 + "%";
                  class92.loadingBarPercentage = 40;
               } else {
                  class45.field618 = (Font)Client.field1134.get(class261.field3634);
                  class37.font_p12full = (Font)Client.field1134.get(class261.field3633);
                  World.field1322 = (Font)Client.field1134.get(class261.field3624);
                  Ignore.field866 = new class291(true);
                  class92.loadingText = "Loaded fonts";
                  class92.loadingBarPercentage = 40;
                  Client.loadingStage = 60;
               }
            } else if(Client.loadingStage == 60) {
               var0 = DecorativeObject.method2889(DecorativeObject.field2194, class18.indexSprites);
               var1 = class96.method1801();
               if(var0 < var1) {
                  class92.loadingText = "Loading title screen - " + var0 * 100 / var1 + "%";
                  class92.loadingBarPercentage = 50;
               } else {
                  class92.loadingText = "Loaded title screen";
                  class92.loadingBarPercentage = 50;
                  TextureProvider.setGameState(5);
                  Client.loadingStage = 70;
               }
            } else if(Client.loadingStage == 70) {
               if(!class91.field1446.method4111()) {
                  class92.loadingText = "Loading config - " + class91.field1446.method4234() + "%";
                  class92.loadingBarPercentage = 60;
               } else {
                  class89.method1721(class91.field1446);
                  class5.method21(class91.field1446);
                  IndexData var27 = class91.field1446;
                  IndexData var19 = class1.indexModels;
                  KitDefinition.field3369 = var27;
                  KitDefinition.field3357 = var19;
                  KitDefinition.field3359 = KitDefinition.field3369.method4133(3);
                  Area.method4312(class91.field1446, class1.indexModels, Client.field930);
                  IndexData var20 = class91.field1446;
                  IndexData var21 = class1.indexModels;
                  NPCComposition.field3567 = var20;
                  NPCComposition.field3584 = var21;
                  IndexData var22 = class91.field1446;
                  class252.field3406 = var22;
                  class170.method3116(class91.field1446, class1.indexModels, Client.isMembers, class45.field618);
                  class165.method3060(class91.field1446, class44.indexInterfaces, class261.indexSoundEffects);
                  IndexData var5 = class91.field1446;
                  IndexData var6 = class1.indexModels;
                  Spotanim.field3347 = var5;
                  Spotanim.field3338 = var6;
                  IndexData var7 = class91.field1446;
                  Varbit.field3391 = var7;
                  IndexData var8 = class91.field1446;
                  class241.field3292 = var8;
                  class241.field3289 = class241.field3292.method4133(16);
                  IndexData var9 = class10.field259;
                  IndexData var10 = class1.indexModels;
                  IndexData var11 = class18.indexSprites;
                  IndexData var12 = RSCanvas.field693;
                  Widget.field2646 = var9;
                  Widget.field2750 = var10;
                  CollisionData.field2309 = var11;
                  GroundObject.field1876 = var12;
                  class46.widgets = new Widget[Widget.field2646.method4136()][];
                  class152.validInterfaces = new boolean[Widget.field2646.method4136()];
                  IndexData var13 = class91.field1446;
                  class240.field3285 = var13;
                  class175.method3347(class91.field1446);
                  class109.method2064(class91.field1446);
                  class175.method3346(class91.field1446);
                  IndexData var14 = class91.field1446;
                  class251.field3399 = var14;
                  class71.chatMessages = new ChatMessages();
                  IndexData var15 = class91.field1446;
                  IndexData var16 = class18.indexSprites;
                  IndexData var17 = RSCanvas.field693;
                  class254.field3441 = var15;
                  class254.field3419 = var16;
                  class215.field2639 = var17;
                  Player.method1178(class91.field1446, class18.indexSprites);
                  class31.method269(class91.field1446, class18.indexSprites);
                  class92.loadingText = "Loaded config";
                  class92.loadingBarPercentage = 60;
                  Client.loadingStage = 80;
               }
            } else if(Client.loadingStage == 80) {
               var0 = 0;
               if(class19.field329 == null) {
                  class19.field329 = class12.method59(class18.indexSprites, "compass", "");
               } else {
                  ++var0;
               }

               if(class31.field452 == null) {
                  class31.field452 = class12.method59(class18.indexSprites, "mapedge", "");
               } else {
                  ++var0;
               }

               if(class8.field246 == null) {
                  class8.field246 = class64.method1117(class18.indexSprites, "mapscene", "");
               } else {
                  ++var0;
               }

               if(class182.field2442 == null) {
                  class182.field2442 = class2.method8(class18.indexSprites, "headicons_pk", "");
               } else {
                  ++var0;
               }

               if(Friend.field820 == null) {
                  Friend.field820 = class2.method8(class18.indexSprites, "headicons_prayer", "");
               } else {
                  ++var0;
               }

               if(class43.field601 == null) {
                  class43.field601 = class2.method8(class18.indexSprites, "headicons_hint", "");
               } else {
                  ++var0;
               }

               if(class31.field458 == null) {
                  class31.field458 = class2.method8(class18.indexSprites, "mapmarker", "");
               } else {
                  ++var0;
               }

               if(IndexData.field3258 == null) {
                  IndexData.field3258 = class2.method8(class18.indexSprites, "cross", "");
               } else {
                  ++var0;
               }

               if(WorldMapType3.field377 == null) {
                  WorldMapType3.field377 = class2.method8(class18.indexSprites, "mapdots", "");
               } else {
                  ++var0;
               }

               if(class262.field3639 == null) {
                  class262.field3639 = class64.method1117(class18.indexSprites, "scrollbar", "");
               } else {
                  ++var0;
               }

               if(class22.field346 == null) {
                  class22.field346 = class64.method1117(class18.indexSprites, "mod_icons", "");
               } else {
                  ++var0;
               }

               if(var0 < 11) {
                  class92.loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
                  class92.loadingBarPercentage = 70;
               } else {
                  FontTypeFace.modIcons = class22.field346;
                  class31.field452.method5043();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 41.0D) - 20;
                  class8.field246[0].method5024(var4 + var1, var2 + var4, var3 + var4);
                  class92.loadingText = "Loaded sprites";
                  class92.loadingBarPercentage = 70;
                  Client.loadingStage = 90;
               }
            } else if(Client.loadingStage == 90) {
               if(!class87.indexTextures.method4111()) {
                  class92.loadingText = "Loading textures - " + class87.indexTextures.method4234() + "%";
                  class92.loadingBarPercentage = 90;
               } else {
                  TextureProvider var26 = new TextureProvider(class87.indexTextures, class18.indexSprites, 20, 0.8D, Client.field930?64:128);
                  class136.method2607(var26);
                  class136.method2587(0.8D);
                  class92.loadingText = "Loaded textures";
                  class92.loadingBarPercentage = 90;
                  Client.loadingStage = 110;
               }
            } else if(Client.loadingStage == 110) {
               WorldMapType3.field393 = new class71();
               GameEngine.field720.method2927(WorldMapType3.field393, 10);
               class92.loadingText = "Loaded input handler";
               class92.loadingBarPercentage = 94;
               Client.loadingStage = 120;
            } else if(Client.loadingStage == 120) {
               if(!DecorativeObject.field2194.method4134("huffman", "")) {
                  class92.loadingText = "Loading wordpack - " + 0 + "%";
                  class92.loadingBarPercentage = 96;
               } else {
                  class165 var25 = new class165(DecorativeObject.field2194.method4145("huffman", ""));
                  class265.field3665 = var25;
                  class92.loadingText = "Loaded wordpack";
                  class92.loadingBarPercentage = 96;
                  Client.loadingStage = 130;
               }
            } else if(Client.loadingStage == 130) {
               if(!class10.field259.method4111()) {
                  class92.loadingText = "Loading interfaces - " + class10.field259.method4234() * 4 / 5 + "%";
                  class92.loadingBarPercentage = 100;
               } else if(!class169.indexScripts.method4111()) {
                  class92.loadingText = "Loading interfaces - " + (80 + class169.indexScripts.method4234() / 6) + "%";
                  class92.loadingBarPercentage = 100;
               } else if(!RSCanvas.field693.method4111()) {
                  class92.loadingText = "Loading interfaces - " + (96 + RSCanvas.field693.method4234() / 50) + "%";
                  class92.loadingBarPercentage = 100;
               } else {
                  class92.loadingText = "Loaded interfaces";
                  class92.loadingBarPercentage = 98;
                  Client.loadingStage = 140;
               }
            } else if(Client.loadingStage == 140) {
               if(!class61.indexWorldMap.method4135(class40.field564.field566)) {
                  class92.loadingText = "Loading world map - " + class61.indexWorldMap.method4118(class40.field564.field566) / 10 + "%";
               } else {
                  if(class43.renderOverview == null) {
                     class43.renderOverview = new RenderOverview();
                     class43.renderOverview.method5298(class61.indexWorldMap, World.field1322, Client.field1134, class8.field246);
                  }

                  var0 = class43.renderOverview.method5180();
                  if(var0 < 100) {
                     class92.loadingText = "Loading world map - " + (var0 * 9 / 10 + 10) + "%";
                  } else {
                     class92.loadingText = "Loaded world map";
                     class92.loadingBarPercentage = 100;
                     Client.loadingStage = 150;
                  }
               }
            } else if(Client.loadingStage == 150) {
               TextureProvider.setGameState(10);
            }
         } else {
            int[] var18 = new int[9];

            for(var1 = 0; var1 < 9; ++var1) {
               var2 = 128 + var1 * 32 + 15;
               var3 = var2 * 3 + 600;
               var4 = class136.SINE[var2];
               var18[var1] = var3 * var4 >> 16;
            }

            Region.method2701(var18, 500, 800, 512, 334);
            class92.loadingText = "Prepared visibility map";
            class92.loadingBarPercentage = 10;
            Client.loadingStage = 30;
         }
      }
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "833525561"
   )
   static void method1051(int var0, String var1) {
      int var2 = class96.field1521;
      int[] var3 = class96.field1531;
      boolean var4 = false;

      for(int var5 = 0; var5 < var2; ++var5) {
         Player var6 = Client.cachedPlayers[var3[var5]];
         if(var6 != null && var6 != XItemContainer.localPlayer && var6.name != null && var6.name.equalsIgnoreCase(var1)) {
            if(var0 == 1) {
               Client.secretPacketBuffer1.putOpcode(68);
               Client.secretPacketBuffer1.putShortOb2(var3[var5]);
               Client.secretPacketBuffer1.putShortLE(0);
            } else if(var0 == 4) {
               Client.secretPacketBuffer1.putOpcode(191);
               Client.secretPacketBuffer1.putShort(var3[var5]);
               Client.secretPacketBuffer1.putShortLE(0);
            } else if(var0 == 6) {
               Client.secretPacketBuffer1.putOpcode(186);
               Client.secretPacketBuffer1.putShortLE(0);
               Client.secretPacketBuffer1.putShort(var3[var5]);
            } else if(var0 == 7) {
               Client.secretPacketBuffer1.putOpcode(204);
               Client.secretPacketBuffer1.putShortLE(0);
               Client.secretPacketBuffer1.method3179(var3[var5]);
            }

            var4 = true;
            break;
         }
      }

      if(!var4) {
         class152.sendGameMessage(4, "", "Unable to find " + var1);
      }

   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;S)V",
      garbageValue = "-20773"
   )
   static void method1052(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = class202.method3650(var1, var2);
      if(var5 != null) {
         if(var5.field2754 != null) {
            class69 var6 = new class69();
            var6.field849 = var5;
            var6.field852 = var0;
            var6.field856 = var4;
            var6.field857 = var5.field2754;
            class14.method76(var6);
         }

         boolean var10 = true;
         if(var5.contentType > 0) {
            var10 = class7.method39(var5);
         }

         if(var10) {
            int var8 = WorldMapType3.method199(var5);
            int var9 = var0 - 1;
            boolean var7 = (var8 >> var9 + 1 & 1) != 0;
            if(var7) {
               if(var0 == 1) {
                  Client.secretPacketBuffer1.putOpcode(78);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 2) {
                  Client.secretPacketBuffer1.putOpcode(218);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 3) {
                  Client.secretPacketBuffer1.putOpcode(216);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 4) {
                  Client.secretPacketBuffer1.putOpcode(169);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 5) {
                  Client.secretPacketBuffer1.putOpcode(104);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 6) {
                  Client.secretPacketBuffer1.putOpcode(228);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 7) {
                  Client.secretPacketBuffer1.putOpcode(244);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 8) {
                  Client.secretPacketBuffer1.putOpcode(190);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 9) {
                  Client.secretPacketBuffer1.putOpcode(35);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

               if(var0 == 10) {
                  Client.secretPacketBuffer1.putOpcode(91);
                  Client.secretPacketBuffer1.putInt(var1);
                  Client.secretPacketBuffer1.putShort(var2);
                  Client.secretPacketBuffer1.putShort(var3);
               }

            }
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "592806910"
   )
   public static int method1053(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + TextureProvider.method2403(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1619448000"
   )
   static void method1055() {
      Client.menuOptionCount = 0;
      Client.field1074 = -1;
      Client.isMenuOpen = false;
   }
}
