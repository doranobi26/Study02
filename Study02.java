Study02.java

class Study02 {
  public static void main(String[] args) {
    //falseとなるようにする
    System.out.println(7 > 8);
    //trueとなるようにする
    System.out.println(2 <= 20);

    System.out.println(true || false);

    System.out.println(false && true);

    System.out.println(2 < 5 && 3 >= 2);

    System.out.println(6 < 5 || 3 >= 1);

    System.out.println(!(10 < 2));

    int a = 26;


    if(a > 10){
      System.out.println("aは10より大きい");
    }
    if(a > 12){
     System.out.println("aは12より大きい");
    }


    int b = 28;
    
    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (b < 12) {
      System.out.println("12より小さい");
    }
    else if (b < 38){
      System.out.println("38以下、28より以上");
    }else{
      System.out.println("それ以外");
    }



     int numbers = 100;

    switch (numbers % 2) {
      case 0:
        System.out.println("2で割り切れます");
        break;
      case 1:
        System.out.println("2で割ると1余ります");
        break;
      case 2:
        System.out.println("2で割ると2余ります");
        break;
    }



    switch (people % 100) {
      case 0:
        System.out.println("白石麻衣です");
        break;
      case 1:
        System.out.println("松村沙友理です");
        break;
      case 2:
        System.out.println("高山一実です");
        break;
      default:
        System.out.println("加藤史帆です");
    }


    int z = 25;
    
    //繰り返し処理
    while (z > 10) {
      System.out.println(number);
      number--;
    }


    for(int i=10;i<=25;i++){
      System.out.println(i+"回です。");
    }


    int e = 1;
    while (e < 20) {
      // eが5の倍数のとき、繰り返し処理を終了
      if (e % 10==0){
        break;
      }
      System.out.println(e);
      e++;
    }



    for (int f = 1; f < 26; f++) {
      // fが3の倍数のとき、処理をスキップ
      if(f % 7==0){
        continue;
      }

      System.out.println(f);
    }


    String [] members={"白石麻衣","松村沙友理","生田絵梨花","斎藤飛鳥","新内眞衣"};

    System.out.println(members[0]);

    System.out.println(members[3]);

    members[2] = "高山一実";

    System.out.println(members[2]);

    String[] m = {"白石麻衣", "松村沙友理", "加藤史帆"};


    for(int i=0;i<ms.length;i++){
      System.out.println("坂道グループで推しているアイドルの名前は"+ms[i]+"です");
    }

    String[] characters = {"ドラえもん", "のび太", "しずか"};

    for(String character:characters){
      System.out.println("私の名前は"+character+"です");
    }

  }
}