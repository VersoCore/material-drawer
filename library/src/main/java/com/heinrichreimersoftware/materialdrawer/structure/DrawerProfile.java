/*
 * Copyright 2014 Heinrich Reimer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heinrichreimersoftware.materialdrawer.structure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.heinrichreimersoftware.materialdrawer.DrawerView;
import com.heinrichreimersoftware.materialdrawer.drawable.RoundedAvatarDrawable;

/**
 * Object to be used with {@link com.heinrichreimersoftware.materialdrawer.DrawerView} to display a profile in the drawer.
 * Can hold an image, a primary text, a secondary text and a listener.
 */
public class DrawerProfile {

    private long mId = -1;
    private Object mTag;

    private Drawable mAvatar;
    private Drawable mBackground;
    private String mName;
    private String mDescription;

    private OnProfileClickListener mOnProfileClickListener;
    private View.OnClickListener mOnClickListener;
    private DrawerView mDrawerView;


    /**
     * Sets an ID the drawer profile
     *
     * @param id ID to set
     */
    public DrawerProfile setId(long id) {
        mId = id;
        return this;
    }

    /**
     * Gets the ID of the drawer profile
     *
     * @return ID of the drawer profile
     */
    public long getId() {
        return mId;
    }

    /**
     * Gets the tag of the drawer item
     *
     * @return tag
     */
    public Object getTag() {
        return mTag;
    }

    /**
     * Sets the tag of the drawer item
     * @param tag tag
     */

    public void setTag(Object tag) {
        this.mTag = tag;
    }

    /**
     * Sets an avatar image to the drawer profile
     *
     * @param avatar Avatar image to set
     */
    public DrawerProfile setAvatar(Drawable avatar) {
        mAvatar = avatar;
        notifyDataChanged();
        return this;
    }

    /**
     * Sets an avatar image to the drawer profile
     *
     * @param avatar Avatar image to set
     */
    public DrawerProfile setAvatar(Context context, Bitmap avatar) {
        mAvatar = new BitmapDrawable(context.getResources(), avatar);
        notifyDataChanged();
        return this;
    }

    /**
     * Sets a rounded avatar image to the drawer profile
     *
     * @param image Avatar image to set
     */
    public DrawerProfile setRoundedAvatar(BitmapDrawable image) {
        return setAvatar(new RoundedAvatarDrawable(image.getBitmap()));
    }

    /**
     * Sets a rounded avatar image to the drawer profile
     *
     * @param image Avatar image to set
     */
    public DrawerProfile setRoundedAvatar(Context context, Bitmap image) {
        return setAvatar(new RoundedAvatarDrawable(new BitmapDrawable(context.getResources(), image).getBitmap()));
    }

    /**
     * Gets the avatar image of the drawer profile
     *
     * @return Avatar image of the drawer profile
     */
    public Drawable getAvatar() {
        return mAvatar;
    }

    /**
     * Gets whether the drawer profile has an avatar image set to it
     *
     * @return True if the drawer profile has an avatar image set to it, false otherwise.
     */
    public boolean hasAvatar() {
        return mAvatar != null;
    }

    /**
     * Removes the avatar image from the drawer profile
     */
    public DrawerProfile removeAvatar() {
        mAvatar = null;
        notifyDataChanged();
        return this;
    }


    /**
     * Sets a background to the drawer profile
     *
     * @param background Background to set
     */
    public DrawerProfile setBackground(Drawable background) {
        mBackground = background;
        notifyDataChanged();
        return this;
    }

    /**
     * Sets a background to the drawer profile
     *
     * @param background Background to set
     */
    public DrawerProfile setBackground(Context context, Bitmap background) {
        mBackground = new BitmapDrawable(context.getResources(), background);
        notifyDataChanged();
        return this;
    }

    /**
     * Gets the background of the drawer profile
     *
     * @return Background of the drawer profile
     */
    public Drawable getBackground() {
        return mBackground;
    }

    /**
     * Gets whether the drawer profile has a background set to it
     *
     * @return True if the drawer profile has a background set to it, false otherwise.
     */
    public boolean hasBackground() {
        return mBackground != null;
    }

    /**
     * Removes the background from the drawer profile
     */
    public DrawerProfile removeBackground() {
        mBackground = null;
        notifyDataChanged();
        return this;
    }


    /**
     * Sets a name to the drawer profile
     *
     * @param name Name to set
     */
    public DrawerProfile setName(String name) {
        mName = name;
        notifyDataChanged();
        return this;
    }

    /**
     * Gets the name of the drawer profile
     *
     * @return Name of the drawer profile
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets whether the drawer profile has a name set to it
     *
     * @return True if the drawer profile has a name set to it, false otherwise.
     */
    public boolean hasName() {
        return mName != null && !mName.equals("");
    }

    /**
     * Removes the name from the drawer profile
     */
    public DrawerProfile removeName() {
        mName = null;
        notifyDataChanged();
        return this;
    }


    /**
     * Sets a description to the drawer profile
     *
     * @param description Description to set
     */
    public DrawerProfile setDescription(String description) {
        mDescription = description;
        notifyDataChanged();
        return this;
    }

    /**
     * Gets the description of the drawer profile
     *
     * @return Description of the drawer profile
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Gets whether the drawer profile has a description set to it
     *
     * @return True if the drawer profile has a description set to it, false otherwise.
     */
    public boolean hasDescription() {
        return mDescription != null && !mDescription.equals("");
    }

    /**
     * Removes the description from the drawer profile
     */
    public DrawerProfile removeDescription() {
        mDescription = null;
        notifyDataChanged();
        return this;
    }


    /**
     * Sets a click listener to the drawer profile
     *
     * @param listener Listener to set
     */
    public DrawerProfile setOnProfileClickListener(OnProfileClickListener listener) {
        mOnProfileClickListener = listener;
        notifyDataChanged();
        return this;
    }

    /**
     * Gets the click listener of the drawer profile
     *
     * @return Click listener of the drawer profile
     */
    public OnProfileClickListener getOnProfileClickListener() {
        return mOnProfileClickListener;
    }

    /**
     * Gets whether the drawer profile has a click listener set to it
     *
     * @return True if the drawer profile has a click listener set to it, false otherwise.
     */
    public boolean hasOnProfileClickListener() {
        return mOnProfileClickListener != null;
    }


    /**
     * Gets the click listener of the drawer profile list item, if null the default behaviour (select profile) is used
     *
     * @return Click listener of the drawer profile list item
     */
    public View.OnClickListener getOnClickListener() {
        return mOnClickListener;
    }

    /**
     * Gets whether the drawer profile has a click listener set to it
     *
     * @return True if the drawer profile has a click listener set to it, false otherwise.
     */
    public boolean hasOnClickListener() {
        return mOnClickListener != null;
    }


    /**
     * Sets a click listener to the drawer profile list item
     *
     * @param listener Listener to set
     */
    public void setOnClickListener(View.OnClickListener listener) {
        this.mOnClickListener = listener;
    }

    /**
     * Removes the click listener from the drawer profile
     */
    public DrawerProfile removeOnProfileClickListener() {
        mOnProfileClickListener = null;
        notifyDataChanged();
        return this;
    }


    /**
     * Attaches the drawer item to a drawer
     *
     * @param drawerView drawer to attach to
     */
    public DrawerProfile attachTo(DrawerView drawerView) {
        mDrawerView = drawerView;
        return this;
    }

    /**
     * Detaches the drawer item from its drawer
     */
    public DrawerProfile detach() {
        mDrawerView = null;
        return this;
    }

    protected void notifyDataChanged() {
        if (mDrawerView != null) {
            mDrawerView.selectProfile(this);
        }
    }


    public interface OnProfileClickListener {
        void onClick(DrawerProfile profile, long id);
    }

    public interface OnProfileSwitchListener {
        void onSwitch(DrawerProfile oldProfile, long oldId, DrawerProfile newProfile, long newId);
    }
}
