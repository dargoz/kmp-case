import SwiftUI

import common
import feature
import featureB

@main
struct iOSApp: App {
    
    init() {
        KoinHelper().doInitKoinModules(modules:[CommonModuleKt.commonModule()])
        
        let featureBUseCsae = FeatureBUseCase(repository: RepositoryImpl())
        
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
