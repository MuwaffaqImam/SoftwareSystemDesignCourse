package com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Problem;

import com.muwaffaq.innopolis.tutorial12_Observer_Facade_Proxy.Proxy.Image;


/**
 * Let's say you have a slow-loading image that is important to your application,
 * but you don't want to make your users wait for it to load before they can use other
 * features of the application. In this case, you can use the Proxy design pattern to load a placeholder
 * image immediately, and then load the actual image in the background.
 * Once the image has loaded, the Proxy can update the placeholder image with the actual image.
 */


public class LoadImage implements Image {
    @Override
    public void display() {

    }
}
