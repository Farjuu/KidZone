package dev.farjana.kidzone.model;

public class DashBoardRecyclerModel {
    private String TitleGrid, buttonText;
    private int ImageId,numOfScore;

    public DashBoardRecyclerModel(String TitleGrid, int numOfScore, String buttonText, int ImageId){
        this.TitleGrid = TitleGrid;
        this.buttonText = buttonText;
        this.numOfScore = numOfScore;
        this.ImageId = ImageId;

    }

    public String getTitleGrid() {
        return TitleGrid;
    }

    public void setTitleGrid(String titleGrid) {
        TitleGrid = titleGrid;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public int getNumOfScore() {
        return numOfScore;
    }

    public void setNumOfScore(int numOfScore) {
        this.numOfScore = numOfScore;
    }
}
