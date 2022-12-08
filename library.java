import java.util.ArrayList;
import java.util.Scanner;

public class library {

    public static void main(String[] args) {

        String[] category = { "C|資訊", "H|公衛", "P|心理", "E|運動", "F|理財", "B|美容" };// 設立一個圖書陣列
        // category[i]可拆成兩個元素, 分類代碼跟類別名稱
        String[] items = { "書號", "書名", "作者", "出版社", "發行日" };// 書的資訊
        String[][] books = { { "C001", "會動的演算法:61個演算法動畫+全圖解逐步拆解，人工智慧、資料分析必備", "渡部有隆", "旗標出版社", "2022/10/19" },
                { "C002", "無瑕的程式碼：敏捷軟體開發技巧守則", "Robert C. Martin", "博碩出版社", "2013/03/22" },
                { "C003", "Java SE 17基礎必修課", "蔡文龍", "碁峰出版社", "2022/06/17" },
                { "C004", "Java 學習手冊", "Marc Loy, Patrick Niemeyer, Daniel Leuck", "歐萊禮出版社", "2021/12/15" },
                { "C005", "從零開始!Java 程式設計入門", "洪國勝", "旗標出版社", "2018/08/15" },
                { "H001", "發現台灣公衛行腳十大公衛計劃紀實錢", "陳拱北預防醫學基金", "大家健康", "2019/12/05" },
                { "H002", "公共衛生法規與倫理", "吳秀玲", "三民出版社", "2021/10/29" },
                { "H003", "圖解公共衛生學", "顧祐瑞", "五南", "2022/10/20" },
                { "H004", "環境衛生害蟲防治", "王凱淞", "新文京開發出版社", "2022/08/01" },
                { "H005", "流行病學原理", "史麗珠", "雙葉書廊", "2022/05/10" },
                { "P001", "被討厭的勇氣", "岸見一郎", "究竟出版社股份有限公司", "2014/10/30" },
                { "P002", "我也不知道自己想要什麼", "全承煥", "采實文化", "2022/11/24" },
                { "P003", "真正的快樂處方", "Anders Hansen", "究竟出版社股份有限公司", "2020/5/01" },
                { "P004", "每天多愛自己一點點：寫給高敏感族的365天自我照顧書", "AMANDA CASSIL", "大田", "2022/11/12" },
                { "P005", "如果可以早知道，你的人生就不會跌倒!", "申榮俊", "積木文化", "2022/08/20" },
                { "E001", "一天只要1次!胸椎運動救悶痛", "黃雅玲", "風和文創", "2020/10/14" },
                { "E002", "運動傷害完全復健指南", "Sue Falson", "臉譜出版社", "2020/4/09" },
                { "E003", "運動生理學", "王鶴森", "新文京開發出版社", "2020-10-12" },
                { "E004", "痠痛拉筋解剖書2：運動傷害復健書", "Brad Walker", "橡實文化", "2016/12/29" },
                { "E005", "完全圖解！自療健身：解決21種最常見症狀，告別全身痠‧痛‧麻", "毛琪瑛", "資料夾文化出版", "2019/12/06" },
                { "F001", "打開網路就有錢 : 我靠自媒體與投資理財打造多元獲利模式", "呂明璋", "遠流出版", "2021/07/28" },
                { "F002", "股息Cover照顧我每一天 : 600張存股達人絕活全公開", "大俠武林", "Smart智富出版", "2021/08/17" },
                { "F003", "我上班,我存到100萬 : 白雪公主理財記", "Snow White", "早安財經文化出版", "2009/07/03" },
                { "F004", "用錢賺錢30歲之後不該逃的理財課", "陳雲", "朴宗基", "2020/11/01" },
                { "F005", "把錢找回來 : 3個福袋讓你留住錢又錢滾錢", "Snow White", "商周出版", "2012/05/08" },
                { "B001", "打造完美素顏肌：每個人都該有一本的理性護膚聖經", "冰寒", "台灣東販", "2020/07/29" },
                { "B002", "肌膚的需要，腸道最知道：由內而生的幸福美肌", "山崎舞子", "尖端", "2020/08/06" },
                { "B003", "處方式保養：一客一方皮膚管理技術經", "劉興亞", "碧盈美學", "2021/08/01" },
                { "B004", "皮膚照護教科書：皮膚保養你做對了嗎?", "高瀬聰子", "台灣東販", "2020/07/29" },
                { "B005", "自己的肌膚自己救：最科學的保養知識全圖解", "MedPartner 美的好朋友醫療團隊", "方寸文創", "2019/01/22" }, };// 圖書資料, 每本書一個一維陣列
        int[] stock = { 3, 2, 5, 4, 2, 1, 15, 7, 6, 3, 2, 2, 2, 3, 3, 5, 4, 3, 2, 2, 3, 4, 5, 6, 2, 7, 6, 3, 2, 2 };// 庫存量
        double[] price = { 490, 458, 442, 616, 458, 315, 468, 323, 361, 371, 237, 300, 269, 300, 284, 593, 600, 356,
                251, 253, 124, 263, 221, 316, 277, 1223, 277, 315 };// 記錄價錢
        ArrayList<String> borrow = new ArrayList<String>(); // 記錄全部借的書

        Scanner input = new Scanner(System.in);

        int flag = 1; // 判斷最後是否繼續借書
        int flag2 = 0; // 判斷借書編號是否有誤

        // 借書code
        while (flag == 1) {
            System.out.println("開始借書，以下為圖書類別及代號：");
            for (String s : category) {
                System.out.printf("%s\t", s);
            }
            System.out.println();
            System.out.println();

            System.out.printf("請輸入代號來看該類別之所有書籍：");
            String a = input.next(); // a表示類別代號
            System.out.println();

            switch (a) {
                case "C":
                case "c":
                    for (int i = 0; i <= 4; i++) {
                        for (int j = 0; j <= 4; j++) {
                            if (stock[i] > 0)
                                System.out.printf("%s\t", books[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case "H":
                case "h":
                    for (int i = 5; i <= 9; i++) {
                        for (int j = 0; j <= 4; j++) {
                            if (stock[i] > 0)
                                System.out.printf("%s\t", books[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case "P":
                case "p":
                    for (int i = 10; i <= 14; i++) {
                        for (int j = 0; j <= 4; j++) {
                            if (stock[i] > 0)
                                System.out.printf("%s\t", books[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case "E":
                case "e":
                    for (int i = 15; i <= 19; i++) {
                        for (int j = 0; j <= 4; j++) {
                            if (stock[i] > 0)
                                System.out.printf("%s\t", books[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case "F":
                case "f":
                    for (int i = 20; i <= 24; i++) {
                        for (int j = 0; j <= 4; j++) {
                            if (stock[i] > 0)
                                System.out.printf("%s\t", books[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case "B":
                case "b":
                    for (int i = 25; i <= 29; i++) {
                        for (int j = 0; j <= 4; j++) {
                            if (stock[i] > 0)
                                System.out.printf("%s\t", books[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("輸入格式錯誤，程式終止");
                    System.exit(0);

            }

            System.out.println();
            System.out.printf("請輸入想借的書籍編號(注意大小寫)：");
            String b = input.next(); // b表示書籍編號

            if (b.equals("E003")) {
                System.out.printf("此書為教科書，只能在圖書館內閱讀，不可外借\n");
            } else {
                for (int i = 0; i <= 29; i++) {
                    for (int j = 0; j <= 4; j++) {
                        if (books[i][j].equals(b)) {
                            if (stock[i] <= 0)
                                System.out.printf("此書目前無庫存\n\n");
                            else {
                                System.out.printf("已成功加入借書清單\n");
                                stock[i]--; // 該書庫存減一
                                for (int k = 0; k <= 4; k++) {
                                    borrow.add(books[i][k]); // 加入借書清單
                                }

                                String c = b.substring(0, 1); // c為書籍編號開頭字母，用以判斷實體位置
                                switch (c) {
                                    case "C":
                                        System.out.printf("C區位於第一道，您可以在那找到該書籍\n\n");
                                        break;

                                    case "H":
                                        System.out.printf("H區位於第二道，您可以在那找到該書籍\n\n");
                                        break;

                                    case "P":
                                        System.out.printf("P區位於第三道，您可以在那找到該書籍\n\n");
                                        break;

                                    case "E":
                                        System.out.printf("E區位於第四道，您可以在那找到該書籍\n\n");
                                        break;

                                    case "F":
                                        System.out.printf("F區位於第五道，您可以在那找到該書籍\n\n");
                                        break;

                                    case "B":
                                        System.out.printf("B區位於第六道，您可以在那找到該書籍\n\n");
                                        break;
                                }
                            }

                            String d = b.substring(3, 4); // d為書籍編碼的最後一位數字，用以判斷此書為該類別的第幾本書
                            System.out.printf("推薦您以下這本書，此書與您欲借閱之書籍相關:\n");
                            if (d.equals("5")) {
                                for (int k = 0; k <= 4; k++) {
                                    System.out.printf("%s\t", books[i - 1][k]);
                                }
                                System.out.println();
                            } else {
                                for (int k = 0; k <= 4; k++) {
                                    System.out.printf("%s\t", books[i + 1][k]);
                                }
                                System.out.println();
                            }
                            flag2 = 1; // 借書編號無誤
                        }
                    }
                }
            }
            System.out.println();

            if (flag2 == 0) {
                System.out.println("輸入格式錯誤，程式終止");
                System.exit(0);
            }

            System.out.printf("輸入1繼續借書，輸入0結束借書：");
            flag = input.nextInt();
            flag2 = 0;

        }
        System.out.println("此次一共借了以下幾本書：");
        for (int i = 0; i < borrow.size(); i++) {
            System.out.printf("%s\t", borrow.get(i));
            if ((i + 1) % 5 == 0)
                System.out.println();
        }

    }
}