package uwtacoma.apps.teachingandlearningcenter;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.content.Context;


/**
 * Created by Rahul on 4/22/2016.
 */
public class HomeFragmentPageAdapter extends FragmentPagerAdapter {


    final int PAGE_COUNT = 3;
        private Context currentContext;
    private String tabTitles[] = {"APPOINTMENTS FOR TODAY", "WHO'S HERE", "WORKSHOPSFOR TODAY"};

    public HomeFragmentPageAdapter(FragmentManager fragmentManager, Context  context){

        super(fragmentManager);
        this.currentContext = context;
    }


    @Override
    public int getCount(){
        return  PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position){

        switch(position){
            case 0: return DemoObjectFragment.newInstance(position);
            case 1: return new WhoIsHereFragment();
            case 2: return new WorkshopsScheduledTodayFragment();
            default: return new WhoIsHereFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        return  this.tabTitles[position];
    }
}
