# ImmersiveUI
ImmersiveUI helps to hide StatusBar, hide NavigationBar,  make StatusBar transparent, make NavigationBar transparent, and offers a REAL full screen experence.   
   
![desc](https://github.com/panespanes/ImmersiveUI/raw/master/desc_4.png)   
# Download
Stop 1. Add it in your root build.gradle at the end of repositories:   
in gradle:
```java
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
or in maven:
```java
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
Step 2. Add the dependency
```java
	dependencies {
	        compile 'com.github.panespanes:ImmersiveUI:-SNAPSHOT'
	}
```
# HowToUse
just one line:
```java
  ImmersiveUI.immersive(activity);
```
add this after setContent(res); in your activity.   
Now the activity looks like this: 
   
![immersive](https://github.com/panespanes/ImmersiveUI/raw/master/immersive_4.png)       
that's it !
# More
you can also separately modify the StatusBar:    
![top](https://github.com/panespanes/ImmersiveUI/raw/master/shot_setTop.png)   
   
or separately modify NavigationBar:    
![bottom](https://github.com/panespanes/ImmersiveUI/raw/master/shot_setFoot.png)   
   
and hide StatusBar:   
![hide](https://github.com/panespanes/ImmersiveUI/raw/master/hideTop_4.png)   
   
      
and make a full screen experience:   
![full](https://github.com/panespanes/ImmersiveUI/raw/master/full_hide_4.png)   
   
creat your Immersive UI right now !
