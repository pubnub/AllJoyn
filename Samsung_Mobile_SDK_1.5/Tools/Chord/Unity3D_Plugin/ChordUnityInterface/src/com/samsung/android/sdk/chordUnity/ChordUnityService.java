/*============================== FILE HEADER =================================
package com.samsung.android.sdk.chordUnity;

public class ChordUnityService extends Service {

    private static final String TAG = "[Chord][ChordUnityService]";
    private static final String TAGClass = "ChordUnityService : ";
    private static final String CHORD_UNITY_MESSAGE_TYPE = "CHORD_UNITY_MESSAGE_TYPE";
    // private static final String PUBLIC_CHANNEL = "Chord";
    // public static String chordFilePath =
    // .getAbsolutePath() + "/ChordUnity";
    private String[] selectedFiles = null;
    public static ChordUnityService mChordUnityService = null;


    private static class ChordUnityEvent {
        public String fromNode;
        public String channel_reason; // channel or reason
        public String payloadType;
        public byte[][] payLoad;
    };

    private static int ftHashKey = 0;

    // for notifying file transfer event to Activity

        public String node;
        public String channel;
        public String hash;
        public String tempFilePath;
        public long fileSize;
        public long offset;
        public long chunkSize;
        public String exchangeId;
        public int totalCount;
        public int reason;
        public int index;
    };








    public IBinder onBind(Intent intent) {



    public void onCreate() {



    public void onDestroy() {









    public void onRebind(Intent intent) {


    }

    public int onStartCommand(Intent intent, int flags, int startId) {


    }

    public boolean onUnbind(Intent intent) {


    }



        }


        int trail = 0;











                }







                }






    public void initialize() throws Exception {


        sChord = new Schord();
        try {
            sChord.initialize(this);

            if (e.getType() == SsdkUnsupportedException.VENDOR_NOT_SUPPORTED) {
                // Vendor is not SAMSUNG
        }

    }

    public int start(int interfaceType, int handle) {
        Log.d(TAG, TAGClass + " : start called from Unity 3D with no-security");
    private class UnityChannelListener {

        public void onNodeJoined(int handle, String fromNode, String fromChannel) {
            Log.v(TAG, TAGClass + "onNodeJoined(), fromNode : " + fromNode + ", fromChannel : "
                    + fromChannel);
            String ipAddr = null;
            if (null != channel) {
                try {
                    ipAddr = channel.getNodeIpAddress(fromNode);
                } catch (IllegalArgumentException e) {
                    Log.d(TAG, TAGClass + e.getMessage());
            }

            obj.fromNode = fromNode;
            obj.channel_reason = fromChannel;
            obj.payloadType = null;
            obj.payLoad = null;
                    + obj.fromNode + obj.channel_reason);
        }

            Log.v(TAG, TAGClass + "onNodeLeft(), fromNode : " + fromNode + ", fromChannel : "
                    + fromChannel);
            ChordUnityEvent obj = new ChordUnityEvent();

            obj.channel_reason = fromChannel;
            obj.payloadType = null;
                    + obj.fromNode + obj.channel_reason);
        }

        public void onDataReceived(int handle, String fromNode, String fromChannel,
                String payloadType, byte[][] payload) {
            ChordUnityEvent obj = new ChordUnityEvent();

            obj.payloadType = payloadType;
            obj.payLoad = payload;
            if (obj.payLoad.length != payload.length) {

                    + obj.fromNode + obj.channel_reason);

        public void onFileWillReceive(int handle, String fromNode, String fromChannel,
                String fileName, String hash, String fileType, String exchangeId, long fileSize) {
                    + " exchangeId : " + exchangeId + " fileSize : " + fileSize + "]");

            if (!targetdir.exists()) {
                targetdir.mkdirs();
            }

            // you should verify that the volume is available before accessing
            // while Chord got failed to write file.
            long blockSize = stat.getBlockSize();
            long totalBlocks = stat.getAvailableBlocks();
            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.channel = fromChannel;
            obj.fileName = fileName;
            obj.hash = hash;
            obj.fileType = fileType;
            obj.fileSize = fileSize;
            obj.exchangeId = exchangeId;
            obj.offset = 0;
            obj.chunkSize = 0;
            obj.reason = 0;
            obj.tempFilePath = "";
            obj.totalCount = 1;
            if (availableMemory < fileSize) {
                rejectFile(fromChannel, exchangeId, SchordManager.INTERFACE_TYPE_WIFI);
                obj.reason = SchordChannel.StatusListener.ERROR_FILE_NO_RESOURCE;
                Log.v(TAG, TAGClass + "onFileWillReceive, hKey : " + obj.exchangeId);
                }
                return;
            }

            }
            Log.v(TAG, TAGClass + "onFileWillReceive, hKey : " + hKey);
            UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onFileWillReceive", hKey);
        }

        public void onFileChunkReceived(int handle, String fromNode, String fromChannel,
                String fileName, String hash, String fileType, String exchangeId, long fileSize,
                long offset) {

            obj.channel = fromChannel;
            obj.hash = hash;
            obj.fileType = fileType;
            obj.fileSize = fileSize;
            obj.offset = offset;
            obj.exchangeId = exchangeId;
            obj.chunkSize = 0;
            obj.index = 0;
            obj.reason = 0;
            obj.tempFilePath = "";
            obj.totalCount = 1;

        public void onFileReceived(int handle, String fromNode, String fromChannel,
                String fileName, String hash, String fileType, String exchangeId, long fileSize,
                String tmpFilePath) {
            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.channel = fromChannel;
            obj.fileName = fileName;
            obj.hash = hash;
            obj.fileType = fileType;
            obj.fileSize = fileSize;

            obj.tempFilePath = tmpFilePath;
            obj.offset = 0;
            obj.chunkSize = 0;
            obj.index = 0;
            obj.reason = 0;
            obj.totalCount = 1;

            }
            UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onFileReceived", hKey);
        }

        public void onFileChunkSent(int handle, String toNode, String toChannel, String fileName,
                String hash, String fileType, String exchangeId, long fileSize, long offset,
                long chunkSize) {
            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();
            obj.fileName = fileName;
            obj.hash = hash;
            obj.exchangeId = exchangeId;
            obj.fileSize = fileSize;
            obj.offset = offset;
            obj.chunkSize = chunkSize;
            obj.index = 0;
            obj.reason = 0;
            obj.tempFilePath = "";
            obj.totalCount = 1;
            }
            }

        public void onFileSent(int handle, String toNode, String toChannel, String fileName,
                String hash, String fileType, String exchangeId) {


            obj.fileName = fileName;
            obj.fileType = fileType;
            obj.hash = hash;
            obj.exchangeId = exchangeId;
            obj.fileSize = 0;
            obj.offset = 0;
            obj.chunkSize = 0;
            obj.index = 0;
            obj.reason = 0;
            obj.tempFilePath = "";
            obj.totalCount = 1;



        public void onFileFailed(int handle, String node, String channel, String fileName,
                String hash, String exchangeId, int reason) {

            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.channel = channel;
            obj.fileName = fileName;
            obj.hash = hash;
            obj.reason = reason;
            obj.fileType = "";
            obj.fileSize = 0;
            obj.offset = 0;
            obj.chunkSize = 0;

        public void onMultiFilesWillReceive(int handle, String fromNode, String fromChannel,
                    + " taskId : " + taskId + " count : " + count + " fileSize : " + fileSize + "]");

            if (!targetdir.exists()) {

            // you should verify that the volume is available before accessing
            // it.
            // while Chord got failed to write file.
            long blockSize = stat.getBlockSize();
            long totalBlocks = stat.getAvailableBlocks();
            long availableMemory = blockSize * totalBlocks;
            String hKey;
            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.channel = fromChannel;
            obj.exchangeId = taskId;
            obj.fileName = fileName;
            obj.fileType = fileType;
            obj.totalCount = count;
            obj.fileSize = fileSize;
            obj.hash = "";
            obj.offset = 0;
            obj.chunkSize = 0;
            obj.index = 0;
            obj.reason = 0;
            obj.tempFilePath = "";
            if (availableMemory < fileSize) {
                rejectFile(fromChannel, taskId, SchordManager.INTERFACE_TYPE_WIFI);
                obj.reason = SchordChannel.StatusListener.ERROR_FILE_NO_RESOURCE;
                synchronized (infoObj.mChordUnityFileTransferEventMap) {
                }
                UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onFileFailed", hKey);
                return;
            }

        public void onMultiFilesChunkReceived(int handle, String fromNode, String fromChannel,
                String fileName, String taskId, int index, String fileType, long fileSize,
            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.exchangeId = taskId;

            if (!bKeyExists) {
                        hKey);

            obj.fileSize = fileSize;

                String fileName, String taskId, int index, String fileType, long fileSize,
                long offset, long chunkSize) {

            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.channel = toChannel;
            obj.fileName = fileName;
            obj.offset = offset;
            obj.reason = 0;


        public void onMultiFilesSent(int handle, String toNode, String toChannel, String fileName,
            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();

            obj.channel = toChannel;
            obj.fileName = fileName;
            obj.exchangeId = taskId;
            obj.index = index;
            obj.fileType = fileType;
            obj.hash = "";
            obj.fileSize = 0;
            obj.offset = 0;
            obj.chunkSize = 0;
            obj.reason = 0;
            obj.tempFilePath = "";
            obj.totalCount = 1;


            UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onMultiFilesSent", hKey);


        public void onMultiFilesFailed(int handle, String node, String channel, String fileName,
                String taskId, int index, int reason) {

            ChordUnityFileTransferEvent obj = new ChordUnityFileTransferEvent();
            obj.exchangeId = taskId;
            obj.fileName = fileName;
            obj.index = index;
            obj.reason = reason;
            obj.hash = "";
            obj.fileType = "";
            obj.fileSize = 0;
            obj.offset = 0;
            obj.chunkSize = 0;
            obj.tempFilePath = "";
            UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onMultiFilesFailed", hKey);

        public void onMultiFilesFinished(int handle, String node, String channel, String taskId,
            UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onMultiFilesFinished", hKey);


        unityINterfaceInfo infoObj = handleInterfaceInfoMap.get(handle);


            Log.v(TAG, TAGClass + "getUnityNodeInfo failed for hasKey: " + hKey);






                + " channel/reason:" + obj.channel_reason);


        unityINterfaceInfo infoObj = handleInterfaceInfoMap.get(handle);


            Log.v(TAG, TAGClass + "getUnityDataReceivedInfo failed for hasKey: " + hKey);










            payload[i++] = new String(obj.payLoad[j]);

                    + new String(obj.payLoad[j]));

                + obj.fromNode + " channel/ip:" + obj.channel_reason);






            values[0] = obj.node;














            Log.d(TAG, "mChordUnityFileTransferEventMap return null, key =" + hKey);







        sChord = null;


    }




    public void browseFiles(int handle) {

        mUnityFileBrowseListener.onFileSelect();


        Log.d(TAG, TAGClass + "onBrowseResult() ");

                UnityPlayer.UnitySendMessage(infoObj.UnityGameObject, "onBrowseResult",



        return selectedFiles;
    }


            int timeoutMsec, int handle) {
                + toNode);

















            String[] strFilePath, int timeout, int handle) throws FileNotFoundException {
        if (null == channel) {





            Log.d(TAG, TAGClass + "multisendFile() file: " + i + " " + strFilePath[i]);







        }




            int chunkRetries, long chunkSize, int handle) {

        SchordChannel channel = null;
        if (null == channel) {


        }












        SchordChannel channel = null;















        // Request the channel interface for the specific channel name.















            int chunkRetries, long chunkSize, int handle) {
        // Request the channel interface for the specific channel name.
        if (null == channel) {














        // Request the channel interface for the specific channel name.



        }





        }
    }



        // Request the channel interface for the specific channel name.

        if (null == channel) {


        }






        }




        Log.d(TAG, TAGClass + "getJoinedNodeList()");










            Log.d(TAG, TAGClass + "getJoinedNodeList() node ::  " + node);









        {














    }




        }
















        }




        int len = object.length;

        {
            Log.e(TAG, TAGClass + "sendDataToAll : wrong inputs : ");

        }







            // );



























        }
















        }
        chordMgr.setSmartDiscoveryEnabled(enabled);




















        int i = 0;



            Log.d(TAG, TAGClass + "getAvailableInterfaceTypes() : No Interfaces Available ");





            Log.d(TAG, TAGClass + "getAvailableInterfaceTypes() Interface type ::  "
                    + interfaceValue);










            Log.d(TAG, TAGClass + "getJoinedChannelList() : No Channel Available ");





            Log.d(TAG, TAGClass + "getJoinedChannelList() channel type ::  " + channel);

        }

































        }







        }





    }


        Log.d(TAG, TAGClass + "stop()");









        }
    }



        return sChord.getVersionCode();




        return sChord.getVersionName();











    class SendDataHandlerCallback implements Handler.Callback {
        public boolean handleMessage(Message msg) {

            if (msg.what == MSG_SENDDATA) {




                    // payload);

                    
                
            

