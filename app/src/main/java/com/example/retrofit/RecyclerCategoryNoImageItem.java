package com.example.retrofit;

public class RecyclerCategoryNoImageItem {

    String productNm; //제품명
    String makr;  //제조사
    String recallPublictBgnde; //리콜공표일
    int lookNum;  //조회수
    String recallSn;  //고유번호

    public RecyclerCategoryNoImageItem() {
    }

    public RecyclerCategoryNoImageItem(String productNm, String makr, String recallPublictBgnde, int lookNum, String recallSn) {
        this.productNm = productNm;
        this.makr = makr;
        this.recallPublictBgnde = recallPublictBgnde;
        this.lookNum = lookNum;
        this.recallSn = recallSn;
    }
}
