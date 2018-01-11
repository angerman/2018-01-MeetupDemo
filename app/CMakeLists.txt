cmake_minimum_required(VERSION 3.4.1)

add_library( native-lib SHARED src/main/cpp/native-lib.cpp )

find_library( log-lib log )

find_library( c-lib     c )
find_library( z-lib     z )
find_library( hs-lib
              HSmeetupdemo
              PATHS ${PROJECT_SOURCE_DIR}/hs-libs/${ANDROID_ABI}
              NO_CMAKE_FIND_ROOT_PATH )

target_link_libraries( native-lib ${log-lib}
                       ${hs-lib}
                       ${c-lib} ${z-lib} )

set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} -Wl,--no-warn-shared-textrel")