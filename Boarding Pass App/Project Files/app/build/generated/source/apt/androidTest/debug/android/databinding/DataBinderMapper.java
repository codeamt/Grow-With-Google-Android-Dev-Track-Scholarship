
package android.databinding;
import com.example.android.boardingpass.test.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 10;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.android.boardingpass.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new com.example.android.boardingpass.databinding.ActivityMainBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/activity_main_0".equals(tag)) {
                            return new com.example.android.boardingpass.databinding.ActivityMainBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case com.example.android.boardingpass.R.layout.flight_info:
                    return com.example.android.boardingpass.databinding.FlightInfoBinding.bind(view, bindingComponent);
                case com.example.android.boardingpass.R.layout.boarding_info:
                    return com.example.android.boardingpass.databinding.BoardingInfoBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.example.android.boardingpass.R.layout.activity_main;
                }
                break;
            }
            case -621701895: {
                if(tag.equals("layout-land/activity_main_0")) {
                    return com.example.android.boardingpass.R.layout.activity_main;
                }
                break;
            }
            case 443532649: {
                if(tag.equals("layout/flight_info_0")) {
                    return com.example.android.boardingpass.R.layout.flight_info;
                }
                break;
            }
            case 1432767069: {
                if(tag.equals("layout/boarding_info_0")) {
                    return com.example.android.boardingpass.R.layout.boarding_info;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"};
    }
}