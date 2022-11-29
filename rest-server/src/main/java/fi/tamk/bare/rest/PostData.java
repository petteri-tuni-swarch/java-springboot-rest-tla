package fi.tamk.bare.rest;

public class PostData {
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    private String data;

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    private String range;

    @Override
    public String toString() {
        String str = "Post Data content:\n";
        if (! "".equals(range)) {
            str += "range: " + range + "\n";
        }
        if (! "".equals(data)) {
            str += "data: " + data + "\n";
        }

        int range = Integer.parseInt(getRange());
        if (range > 250) {
            str += "long range\n";
        } else {
            str += "modest range\n";
        }

        return str;
    }
}
