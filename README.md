# News_MVP

This project demonstrates the **Model-View-Presenter(MVP) architecture** on Android. This app is written using **Java** language and attempts to use the latest cutting edge libraries and tools:
1. **Retrofit**: A type-safe HTTP client for Android and Java
2. **Dagger2**: A fast dependency injector for Android and Java
3. **ButterKnife**: Field and method binding for Android views

## Screenshots
`Login`:
<br/>
<img src="https://user-images.githubusercontent.com/26871154/36075831-bf823d4e-0f5c-11e8-88c2-d6296b32159c.PNG" height="400">

`News List`
<br/>
<img src="https://user-images.githubusercontent.com/26871154/36075843-e9c743b0-0f5c-11e8-9a82-95fcc68ee517.PNG" height="400">

`News Detail`
<br/>
<img src="https://user-images.githubusercontent.com/26871154/36075849-fe157c10-0f5c-11e8-99cd-16792ce52302.PNG" height="400">

## Project Structure
```
News_MVP
├──data
├──di
├──util
├──ui
│   ├──base
│   ├──mainscreen
│   │   ├──login
│   │   │   ├──LoginActivity
│   │   │   ├──LoginContract
│   │   │   ├──LoginModule
│   │   │   ├──LoginPresenter
│   │   ├──newslist
│   │   │   ├──NewsListAdapter
│   │   │   ├──NewsListContract
│   │   │   ├──NewsListFragment
│   │   │   ├──NewsListModule
│   │   │   ├──NewsListPresenter
│   │   ├──newsdetail
│   │   ├──MainActivity
│   │   ├──NewsListProvider
│   ├──SplashActivity
├──App
