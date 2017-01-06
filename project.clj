(defproject clojure-lambda-skeleton "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]
                 [cheshire "5.6.3"]]
  :aot :all
  :target-path "target/%s"
  :git-version {:version-cmd "git rev-parse --short HEAD"}
  :profiles {:uberjar {:aot :all
                       :plugins [[org.clojars.cvillecsteele/lein-git-version "1.2.5"]]}
             :dev {:plugins [[org.clojars.cvillecsteele/lein-git-version "1.2.5"]]}
             })
