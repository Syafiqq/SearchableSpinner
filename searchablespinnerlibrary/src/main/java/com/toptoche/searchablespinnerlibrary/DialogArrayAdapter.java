package com.toptoche.searchablespinnerlibrary;

/*
 * This <SearchableSpinner> created by : 
 * Name         : syafiq
 * Date / Time  : 30 July 2017, 6:21 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;

public class DialogArrayAdapter<T> extends ArrayAdapter<T>
{
    public DialogArrayAdapter(Context context, int resource)
    {
        super(context, resource);
    }

    public DialogArrayAdapter(Context context, int resource, int textViewResourceId)
    {
        super(context, resource, textViewResourceId);
    }

    public DialogArrayAdapter(Context context, int resource, T[] objects)
    {
        super(context, resource, objects);
    }

    public DialogArrayAdapter(Context context, int resource, int textViewResourceId, T[] objects)
    {
        super(context, resource, textViewResourceId, objects);
    }

    public DialogArrayAdapter(Context context, int resource, List<T> objects)
    {
        super(context, resource, objects);
    }

    public DialogArrayAdapter(Context context, int resource, int textViewResourceId, List<T> objects)
    {
        super(context, resource, textViewResourceId, objects);
    }

    @Override public int getCount()
    {
        return super.getCount();
    }

    @Override public T getItem(int position)
    {
        return super.getItem(position);
    }

    public int getDialogCount()
    {
        return this.getCount();
    }

    public T getDialogItem(int position)
    {
        return this.getItem(position);
    }
}
