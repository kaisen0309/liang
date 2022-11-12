public class calender {
    public static void main(String[] args) {
        String weekday = "日一二三四五六";
        String monthday = "303130313128313031303131";
        int count = 0; // 處理每七天換行

        // Sep
        System.out.println("九月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期
        }
        System.out.println();

        for (int i = 1; i <= 4; i++) { // 輸出9月1日前的空格
            System.out.printf("  \t");
            count++;
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(0, 2)); i++) {
            count++;
            if (i == 10) {
                System.out.printf("[A]\t"); // A: 中秋
            }
            if (i == 12) {
                System.out.printf("[B]\t"); // B: 開學
            }
            if (i == 13) {
                System.out.printf("[C]\t"); // C: 小迎新
            }
            if (i == 22) {
                System.out.printf("[D]\t"); // D: 接風
            }
            if (i == 24) {
                System.out.printf("[E]\t"); // E: 大迎新
            }

            if (i != 10 && i != 12 && i != 13 && i != 22 && i != 24) { // 如果不是上面這些日期
                if (count % 7 == 0 || count % 7 == 1) // 星期六或日
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i); // 其他平常日
            }
            if (count % 7 == 0) // 每七天換行
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Oct
        System.out.println("十月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期 //輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(2, 4)); i++) {
            count++;
            if (i == 8) {
                System.out.printf("[F]\t"); // F: 直屬聚
            }
            if (i == 10) {
                System.out.printf("[G]\t"); // G: 雙十節
            }
            if (i == 17) {
                System.out.printf("[H]\t"); // H: SAS考試
            }
            if (i == 19) {
                System.out.printf("[I]\t"); // I: 熱力學期中
            }
            if (i == 21) {
                System.out.printf("[J]\t"); // J: Java作業
            }

            if (i != 8 && i != 10 && i != 17 && i != 19 && i != 21) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Nov
        System.out.println("十一月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期 //輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(4, 6)); i++) {
            count++;
            if (i == 13) {
                System.out.printf("[K]\t"); // K: Java作業
            }
            if (i == 14) {
                System.out.printf("[L]\t"); // L: 衛概期中
            }
            if (i == 19) {
                System.out.printf("[M]\t"); // M: 二手市集
            }
            if (i == 23) {
                System.out.printf("[N]\t"); // N: 服學出隊
            }

            if (i != 13 && i != 14 && i != 19 && i != 23) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }
            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Dec
        System.out.println("十二月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期 //輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(6, 8)); i++) {
            count++;
            if (i == 4) {
                System.out.printf("[O]\t"); // O: 公衛盃
            }
            if (i == 10) {
                System.out.printf("[P]\t"); // P: 看眼科
            }
            if (i == 16) {
                System.out.printf("[Q]\t"); // Q: 耶誕晚會
            }
            if (i == 21) {
                System.out.printf("[R]\t"); // R: 熱力學期中
            }
            if (i == 23) {
                System.out.printf("[S]\t"); // S: 系員大會
            }

            if (i != 4 && i != 10 && i != 16 && i != 21 && i != 23) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Jan
        System.out.println("一月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期 //輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(8, 10)); i++) {
            count++;

            if (i == 1 || i == 2) {
                System.out.printf("[T]\t"); // T: 元旦
            }
            if (i == 11) {
                System.out.printf("[U]\t"); // U: 生日
            }
            if (i == 20 || i == 21 || i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27) {
                System.out.printf("[V]\t"); // V: 春節
            }
            if (i != 1 && i != 2 && i != 11 && i != 20 && i != 21 && i != 22 && i != 23 && i != 24 && i != 25 && i != 26
                    && i != 27) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Feb
        System.out.println("二月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期 //輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(10, 12)); i++) {
            count++;
            if (i == 13) {
                System.out.printf("[W]\t"); // W:開學
            }
            if (i == 21) {
                System.out.printf("[X]\t"); // X:加退選
            }
            if (i == 27 || i == 28) {
                System.out.printf("[Y]\t"); // Y:228放假
            }

            if (i != 13 && i != 21 && i != 27 && i != 28) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Mar
        System.out.println("三月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期 //輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(12, 14)); i++) {
            count++;
            if (i == 18) {
                System.out.printf("[Z]\t"); // Z:看眼科
            }
            if (i == 22) {
                System.out.printf("[a]\t"); // a:夜跑
            }
            if (i != 18 && i != 22) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Apr
        System.out.println("四月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(14, 16)); i++) {
            count++;
            if (i == 3 || i == 4 || i == 5) {
                System.out.printf("[b]\t"); // b:兒童節+清明節
            }
            if (i != 3 && i != 4 && i != 5) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // May
        System.out.println("五月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(16, 18)); i++) {
            count++;
            if (i == 1) {
                System.out.printf("[c]\t"); // c:勞動節
            }
            if (i == 4) {
                System.out.printf("[d]\t"); // d:停修申請
            }
            if (i == 22) {
                System.out.printf("[e]\t"); // e:雙主修申請
            }
            if (i == 29) {
                System.out.printf("[f]\t"); // f:

            }

            if (i != 1 && i != 4 && i != 22 && i != 29) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }
            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Jun
        System.out.println("六月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(18, 20)); i++) {
            count++;
            if (i == 2) {
                System.out.printf("[f]\t"); // f:選課開始/結束
            }
            if (i == 16) {
                System.out.printf("[g]\t"); // g:放暑假
            }
            if (i == 22 || i == 23) {
                System.out.printf("[h]\t"); // h:端午節
            }

            if (i != 2 && i != 16 && i != 22 && i != 23) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Jul
        System.out.println("七月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(20, 22)); i++) {
            count++;

            if (i == 3) {
                System.out.printf("[i]\t"); // i:高中同學會
            }
            if (i == 15) {
                System.out.printf("[j]\t"); // j:看眼科
            }
            if (i == 18) {
                System.out.printf("[k]\t"); // k:去台北
            }
            if (i != 3 && i != 15 && i != 18) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // Aug
        System.out.println("八月");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t", weekday.substring(i, i + 1)); // 輸出星期
        }
        System.out.println();

        for (int i = 1; i <= count % 7; i++) {
            System.out.printf("  \t");
        }

        for (int i = 1; i <= Integer.parseInt(monthday.substring(22, 24)); i++) {
            count++;
            if (i == 8) {
                System.out.printf("[l]\t"); // l: 買蛋糕
            }
            if (i == 24) {
                System.out.printf("[m]\t"); // m: 打工申請
            }
            if (i != 8 && i != 24) {
                if (count % 7 == 0 || count % 7 == 1)
                    System.out.printf("休\t");
                else
                    System.out.printf("%d\t", i);
            }

            if (count % 7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();

        // 輸出註解
        System.out.printf(
                "註記: 休:周休二日\n[A]: 中秋\t[B]: 開學\t[C]: 小迎新\t[D]: 接風\t[E]: 大迎新\n[F]: 直屬聚\t[G]: 雙十節\t[H]: SAS考試\t[I]: 熱力學期中\t[J]: Java作業\n[K]: Java作業\t[L]: 衛概期中\t[M]: 二手市集\t[N]: 服學出隊\t[O]: 公衛盃\n[P]: 看眼科\t[Q]: 耶誕晚會\t[R]: 熱力學期中\t[S]: 系員大會\t[T]: 元旦\n[U]: 生日\t[V]: 春節\t[W]: 開學\t[X]: 加退選\t[Y]: 228放假\n[Z]: 看眼科\t[a]: 夜跑\t[b]: 清明節\t[c]: 勞動節\t[d]: 停修申請\n[e]: 雙主修申請\t[f]: 選課\t[g]: 放暑假\t[h]: 端午節\t[i]: 高中同學會\n[j]: 看眼科\t[k]: 去台北\t[l]: 買蛋糕\t[m]: 打工申請\n");
    }
}
