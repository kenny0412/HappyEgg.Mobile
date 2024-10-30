[![contributors][contributors-shield]][contributors-url]
[![console][console]][console-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://play.google.com/store/apps/details?id=">
    <img src="https://img.freepik.com/premium-vector/cute-happy-egg-character-funny-jump-egg-cartoon-emoticon-flat-style-chick-emoji-vector_841552-285.jpg" alt="Logo" >
  </a>

<h2 align="center">Kotlin Multiplatform</h2>
  <p align="center">
    Happy Egg Mobile is an Android project containing multiplatform apps, shared resources, and automation scripts. It includes configuration files for CI/CD pipelines (GitHub Actions).
    <br />
  </p>
</div>

## Getting Started

### Prerequisites

- Github token
    - You can create a new one in your github centr account.
- Android studio 4.0 or higher
- Kotlin Multiplatform plugin
- Xcode for iOS builds
- JDK

### Installation
To get started with the Happy Egg project, follow these steps:
* Android: Android Studio and an emulator or physical device.
* iOS: Xcode and a simulator or physical device.

1. Clone the Repository:
- Open Android Studio, select `File` > `New` > `Project from Version Control`, choose `Git or GitHub`, enter the repository URL, select the directory, click `Clone` and wait for the process to finish; Android Studio will open the cloned project automatically.
  ```
  https://github.com/kenny0412/HappyEggMobile.git
  ```
2. Build and Run on Android: Open androidApp in Android Studio, select an emulator, and run the app.

3. Build and Run on iOS: Open iosApp in Xcode, select a simulator, and run the app.

Now you're ready to start developing and contributing to the HappyEgg project! If you encounter any issues or have questions, please refer to the project's documentation or reach out to the maintainers for assistance.

### Project structure

The diagram displays the first three levels of folders within the project. For a detailed explanation of each folder's structure and significance, please refer to the section below titled 'HappyEgg Project Structure.

```
- shared/
  - commonMain/
    - di/
    - network/
    - models/
    - repository/
    - usecases/
    - viewmodel/
  - androidMain/
    - Android-specific implementations (e.g., local storage, platform-specific APIs)
  - iosMain/
    - iOS-specific implementations (e.g., platform-specific APIs)
- androidApp/
- iosApp/
```
#### Dependencies
List the key dependencies here, especially shared libraries, such as:

- Ktor (for network calls)
- Koin or other DI frameworks
- Serialization libraries (e.g., kotlinx.serialization)


### Version Control and Commit Standards

- We embrace the Gitflow workflow structure to effectively manage our branches. Gitflow, a widely adopted branching model, offers a robust framework for organizing and collaborating on projects. To delve deeper into Gitflow, you can explore it [here](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=What%20is%20Gitflow%3F,by%20Vincent%20Driessen%20at%20nvie.). Additionally, we adhere to conventional commits for our commit messages, ensuring clarity and consistency in our development process. Learn more about conventional commits [here](https://centr.atlassian.net/wiki/spaces/CEX/pages/2478604344/Engineering+Workflows#%F0%9F%A7%90-Pull-Requests-and-Peer-Review).
    - TL;DR: each branch should be of the form: feature|bug|chore|etc/CX-{NumberOfTicket}-{SmallDescription}.
    - Also, we encourage to prepend to each commit message the ID of the Ticket in which we are working. You can run `enable-hooks` script to do it automatically for you at each commit.

### Build and Deployment
// TODO

### Who to contact? (Team)
- [@Kenny Cardenas](https://github.com/kenny0412) - Mid. Engineering Manager
- [@Michael Arias](https://github.com/micha032799) - Junior Dev
- [@Brandon Cardenas](https://github.com/Kendall-22) - Junior Dev
- [@Kendall Araya](https://github.com/Sean17bcr) - Junior Dev


[contributors-shield]: https://img.shields.io/github/contributors/kenny0412/HappyEggMobile.svg?style=for-the-badge
[contributors-url]: https://github.com/centrfit/Stalker.Android/graphs/contributors
[console]: https://img.shields.io/badge/console-414141?style=for-the-badge&logo=googleplay&logoColor=white
[console-url]: https://play.google.com/console
