{-# LANGUAGE ForeignFunctionInterface #-}

module MeetupDemo where

import Foreign.C

foreign export ccall "hs_hello" hello :: IO CString

hello :: IO CString
hello = newCString "Hello from Haskell"

