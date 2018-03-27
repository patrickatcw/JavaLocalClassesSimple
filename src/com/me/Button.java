package com.me;

//step 1 create class
public class Button {

    //step 2 create fields
    private String title;
    private OnClickListener onClickLister;

    //step 3 constructor
    public Button(String title) {
        this.title = title;
    }

    //step 4 getter
    public String getTitle() {
        return title;
    }

    //step 5 method
    public void setOnClickListener(OnClickListener onClickListener){

        this.onClickLister = onClickListener;

    }

    //step 6 method
    public void onClick(){

        this.onClickLister.onClick(this.title);

    }

    //step 7 create interface
    public interface OnClickListener{
        public void onClick(String title);

        //step 8 back to main method

    }

}

