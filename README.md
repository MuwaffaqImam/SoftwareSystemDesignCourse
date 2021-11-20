
# bye_bye_localization
its Just a Simple `Text` widget That will provide fast translation for any text. it can translate to more than 56 languages.

No more Localization boring configuration files, all you have to do is change your old `Text()` widget to `TranslatedText()` and enjoy the sweet sweet life without Localization
 
## Demo


# How to use?
**Step 1: All you have to do is call the widget**

`TranslatedText('your text');`

 **Step2: don't forget to call init the widget using the Manager**

 ` Future<bool> initWidget() async {
    return await TranslationManager().init(
      originLanguage: Languages.ENGLISH,
      translateToLanguage: Languages.ARABIC,
    );
  } 
`

**Step 3: Bye me Coffee, because I just saved you lots of time!**


## Live Demo
below you will find a link to APK contains live demo 

[Download APK](https://www.dropbox.com/s/3o6t4f9mxnf94hu/bye%20bye%20localization.apk?dl=0)

##Author 
Muwaffaq Imam

- Edu email : m.imam@innopolis.university	