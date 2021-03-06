/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FileEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FileEndpoint target = (FileEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "antexclude":
        case "antExclude": target.setAntExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "antfiltercasesensitive":
        case "antFilterCaseSensitive": target.setAntFilterCaseSensitive(property(camelContext, boolean.class, value)); return true;
        case "antinclude":
        case "antInclude": target.setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "appendchars":
        case "appendChars": target.setAppendChars(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreate":
        case "autoCreate": target.setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffersize":
        case "bufferSize": target.setBufferSize(property(camelContext, int.class, value)); return true;
        case "charset": target.setCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "chmod": target.setChmod(property(camelContext, java.lang.String.class, value)); return true;
        case "chmoddirectory":
        case "chmodDirectory": target.setChmodDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "copyanddeleteonrenamefail":
        case "copyAndDeleteOnRenameFail": target.setCopyAndDeleteOnRenameFail(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "delete": target.setDelete(property(camelContext, boolean.class, value)); return true;
        case "directorymustexist":
        case "directoryMustExist": target.setDirectoryMustExist(property(camelContext, boolean.class, value)); return true;
        case "donefilename":
        case "doneFileName": target.setDoneFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerdeletetargetfile":
        case "eagerDeleteTargetFile": target.setEagerDeleteTargetFile(property(camelContext, boolean.class, value)); return true;
        case "eagermaxmessagesperpoll":
        case "eagerMaxMessagesPerPoll": target.setEagerMaxMessagesPerPoll(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exclude": target.setExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusivereadlockstrategy":
        case "exclusiveReadLockStrategy": target.setExclusiveReadLockStrategy(property(camelContext, org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class, value)); return true;
        case "extendedattributes":
        case "extendedAttributes": target.setExtendedAttributes(property(camelContext, java.lang.String.class, value)); return true;
        case "fileexist":
        case "fileExist": target.setFileExist(property(camelContext, org.apache.camel.component.file.GenericFileExist.class, value)); return true;
        case "filename":
        case "fileName": target.setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filter": target.setFilter(property(camelContext, org.apache.camel.component.file.GenericFileFilter.class, value)); return true;
        case "filterdirectory":
        case "filterDirectory": target.setFilterDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "filterfile":
        case "filterFile": target.setFilterFile(property(camelContext, java.lang.String.class, value)); return true;
        case "flatten": target.setFlatten(property(camelContext, boolean.class, value)); return true;
        case "forcewrites":
        case "forceWrites": target.setForceWrites(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "idempotent": target.setIdempotent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "idempotentkey":
        case "idempotentKey": target.setIdempotentKey(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotentrepository":
        case "idempotentRepository": target.setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "inprogressrepository":
        case "inProgressRepository": target.setInProgressRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "include": target.setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "jailstartingdirectory":
        case "jailStartingDirectory": target.setJailStartingDirectory(property(camelContext, boolean.class, value)); return true;
        case "keeplastmodified":
        case "keepLastModified": target.setKeepLastModified(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "localworkdirectory":
        case "localWorkDirectory": target.setLocalWorkDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "maxdepth":
        case "maxDepth": target.setMaxDepth(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "mindepth":
        case "minDepth": target.setMinDepth(property(camelContext, int.class, value)); return true;
        case "move": target.setMove(property(camelContext, java.lang.String.class, value)); return true;
        case "moveexisting":
        case "moveExisting": target.setMoveExisting(property(camelContext, java.lang.String.class, value)); return true;
        case "moveexistingfilestrategy":
        case "moveExistingFileStrategy": target.setMoveExistingFileStrategy(property(camelContext, org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class, value)); return true;
        case "movefailed":
        case "moveFailed": target.setMoveFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "oncompletionexceptionhandler":
        case "onCompletionExceptionHandler": target.setOnCompletionExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "premove":
        case "preMove": target.setPreMove(property(camelContext, java.lang.String.class, value)); return true;
        case "presort":
        case "preSort": target.setPreSort(property(camelContext, boolean.class, value)); return true;
        case "probecontenttype":
        case "probeContentType": target.setProbeContentType(property(camelContext, boolean.class, value)); return true;
        case "processstrategy":
        case "processStrategy": target.setProcessStrategy(property(camelContext, org.apache.camel.component.file.GenericFileProcessStrategy.class, value)); return true;
        case "readlock":
        case "readLock": target.setReadLock(property(camelContext, java.lang.String.class, value)); return true;
        case "readlockcheckinterval":
        case "readLockCheckInterval": target.setReadLockCheckInterval(property(camelContext, long.class, value)); return true;
        case "readlockdeleteorphanlockfiles":
        case "readLockDeleteOrphanLockFiles": target.setReadLockDeleteOrphanLockFiles(property(camelContext, boolean.class, value)); return true;
        case "readlockidempotentreleaseasync":
        case "readLockIdempotentReleaseAsync": target.setReadLockIdempotentReleaseAsync(property(camelContext, boolean.class, value)); return true;
        case "readlockidempotentreleaseasyncpoolsize":
        case "readLockIdempotentReleaseAsyncPoolSize": target.setReadLockIdempotentReleaseAsyncPoolSize(property(camelContext, int.class, value)); return true;
        case "readlockidempotentreleasedelay":
        case "readLockIdempotentReleaseDelay": target.setReadLockIdempotentReleaseDelay(property(camelContext, int.class, value)); return true;
        case "readlockidempotentreleaseexecutorservice":
        case "readLockIdempotentReleaseExecutorService": target.setReadLockIdempotentReleaseExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "readlocklogginglevel":
        case "readLockLoggingLevel": target.setReadLockLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "readlockmarkerfile":
        case "readLockMarkerFile": target.setReadLockMarkerFile(property(camelContext, boolean.class, value)); return true;
        case "readlockminage":
        case "readLockMinAge": target.setReadLockMinAge(property(camelContext, long.class, value)); return true;
        case "readlockminlength":
        case "readLockMinLength": target.setReadLockMinLength(property(camelContext, long.class, value)); return true;
        case "readlockremoveoncommit":
        case "readLockRemoveOnCommit": target.setReadLockRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "readlockremoveonrollback":
        case "readLockRemoveOnRollback": target.setReadLockRemoveOnRollback(property(camelContext, boolean.class, value)); return true;
        case "readlocktimeout":
        case "readLockTimeout": target.setReadLockTimeout(property(camelContext, long.class, value)); return true;
        case "recursive": target.setRecursive(property(camelContext, boolean.class, value)); return true;
        case "renameusingcopy":
        case "renameUsingCopy": target.setRenameUsingCopy(property(camelContext, boolean.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "shuffle": target.setShuffle(property(camelContext, boolean.class, value)); return true;
        case "sortby":
        case "sortBy": target.setSortBy(property(camelContext, java.lang.String.class, value)); return true;
        case "sorter": target.setSorter(property(camelContext, java.util.Comparator.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "startingdirectorymustexist":
        case "startingDirectoryMustExist": target.setStartingDirectoryMustExist(property(camelContext, boolean.class, value)); return true;
        case "startingdirectorymusthaveaccess":
        case "startingDirectoryMustHaveAccess": target.setStartingDirectoryMustHaveAccess(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tempfilename":
        case "tempFileName": target.setTempFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "tempprefix":
        case "tempPrefix": target.setTempPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowNullBody", boolean.class);
        answer.put("antExclude", java.lang.String.class);
        answer.put("antFilterCaseSensitive", boolean.class);
        answer.put("antInclude", java.lang.String.class);
        answer.put("appendChars", java.lang.String.class);
        answer.put("autoCreate", boolean.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("bufferSize", int.class);
        answer.put("charset", java.lang.String.class);
        answer.put("chmod", java.lang.String.class);
        answer.put("chmodDirectory", java.lang.String.class);
        answer.put("copyAndDeleteOnRenameFail", boolean.class);
        answer.put("delay", long.class);
        answer.put("delete", boolean.class);
        answer.put("directoryMustExist", boolean.class);
        answer.put("doneFileName", java.lang.String.class);
        answer.put("eagerDeleteTargetFile", boolean.class);
        answer.put("eagerMaxMessagesPerPoll", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("exclude", java.lang.String.class);
        answer.put("exclusiveReadLockStrategy", org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class);
        answer.put("extendedAttributes", java.lang.String.class);
        answer.put("fileExist", org.apache.camel.component.file.GenericFileExist.class);
        answer.put("fileName", java.lang.String.class);
        answer.put("filter", org.apache.camel.component.file.GenericFileFilter.class);
        answer.put("filterDirectory", java.lang.String.class);
        answer.put("filterFile", java.lang.String.class);
        answer.put("flatten", boolean.class);
        answer.put("forceWrites", boolean.class);
        answer.put("greedy", boolean.class);
        answer.put("idempotent", java.lang.Boolean.class);
        answer.put("idempotentKey", java.lang.String.class);
        answer.put("idempotentRepository", org.apache.camel.spi.IdempotentRepository.class);
        answer.put("inProgressRepository", org.apache.camel.spi.IdempotentRepository.class);
        answer.put("include", java.lang.String.class);
        answer.put("initialDelay", long.class);
        answer.put("jailStartingDirectory", boolean.class);
        answer.put("keepLastModified", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("localWorkDirectory", java.lang.String.class);
        answer.put("maxDepth", int.class);
        answer.put("maxMessagesPerPoll", int.class);
        answer.put("minDepth", int.class);
        answer.put("move", java.lang.String.class);
        answer.put("moveExisting", java.lang.String.class);
        answer.put("moveExistingFileStrategy", org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class);
        answer.put("moveFailed", java.lang.String.class);
        answer.put("noop", boolean.class);
        answer.put("onCompletionExceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("preMove", java.lang.String.class);
        answer.put("preSort", boolean.class);
        answer.put("probeContentType", boolean.class);
        answer.put("processStrategy", org.apache.camel.component.file.GenericFileProcessStrategy.class);
        answer.put("readLock", java.lang.String.class);
        answer.put("readLockCheckInterval", long.class);
        answer.put("readLockDeleteOrphanLockFiles", boolean.class);
        answer.put("readLockIdempotentReleaseAsync", boolean.class);
        answer.put("readLockIdempotentReleaseAsyncPoolSize", int.class);
        answer.put("readLockIdempotentReleaseDelay", int.class);
        answer.put("readLockIdempotentReleaseExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("readLockLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("readLockMarkerFile", boolean.class);
        answer.put("readLockMinAge", long.class);
        answer.put("readLockMinLength", long.class);
        answer.put("readLockRemoveOnCommit", boolean.class);
        answer.put("readLockRemoveOnRollback", boolean.class);
        answer.put("readLockTimeout", long.class);
        answer.put("recursive", boolean.class);
        answer.put("renameUsingCopy", boolean.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.Object.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("shuffle", boolean.class);
        answer.put("sortBy", java.lang.String.class);
        answer.put("sorter", java.util.Comparator.class);
        answer.put("startScheduler", boolean.class);
        answer.put("startingDirectoryMustExist", boolean.class);
        answer.put("startingDirectoryMustHaveAccess", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("tempFileName", java.lang.String.class);
        answer.put("tempPrefix", java.lang.String.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        FileEndpoint target = (FileEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "antexclude":
        case "antExclude": return target.getAntExclude();
        case "antfiltercasesensitive":
        case "antFilterCaseSensitive": return target.isAntFilterCaseSensitive();
        case "antinclude":
        case "antInclude": return target.getAntInclude();
        case "appendchars":
        case "appendChars": return target.getAppendChars();
        case "autocreate":
        case "autoCreate": return target.isAutoCreate();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buffersize":
        case "bufferSize": return target.getBufferSize();
        case "charset": return target.getCharset();
        case "chmod": return target.getChmod();
        case "chmoddirectory":
        case "chmodDirectory": return target.getChmodDirectory();
        case "copyanddeleteonrenamefail":
        case "copyAndDeleteOnRenameFail": return target.isCopyAndDeleteOnRenameFail();
        case "delay": return target.getDelay();
        case "delete": return target.isDelete();
        case "directorymustexist":
        case "directoryMustExist": return target.isDirectoryMustExist();
        case "donefilename":
        case "doneFileName": return target.getDoneFileName();
        case "eagerdeletetargetfile":
        case "eagerDeleteTargetFile": return target.isEagerDeleteTargetFile();
        case "eagermaxmessagesperpoll":
        case "eagerMaxMessagesPerPoll": return target.isEagerMaxMessagesPerPoll();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exclude": return target.getExclude();
        case "exclusivereadlockstrategy":
        case "exclusiveReadLockStrategy": return target.getExclusiveReadLockStrategy();
        case "extendedattributes":
        case "extendedAttributes": return target.getExtendedAttributes();
        case "fileexist":
        case "fileExist": return target.getFileExist();
        case "filename":
        case "fileName": return target.getFileName();
        case "filter": return target.getFilter();
        case "filterdirectory":
        case "filterDirectory": return target.getFilterDirectory();
        case "filterfile":
        case "filterFile": return target.getFilterFile();
        case "flatten": return target.isFlatten();
        case "forcewrites":
        case "forceWrites": return target.isForceWrites();
        case "greedy": return target.isGreedy();
        case "idempotent": return target.getIdempotent();
        case "idempotentkey":
        case "idempotentKey": return target.getIdempotentKey();
        case "idempotentrepository":
        case "idempotentRepository": return target.getIdempotentRepository();
        case "inprogressrepository":
        case "inProgressRepository": return target.getInProgressRepository();
        case "include": return target.getInclude();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "jailstartingdirectory":
        case "jailStartingDirectory": return target.isJailStartingDirectory();
        case "keeplastmodified":
        case "keepLastModified": return target.isKeepLastModified();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "localworkdirectory":
        case "localWorkDirectory": return target.getLocalWorkDirectory();
        case "maxdepth":
        case "maxDepth": return target.getMaxDepth();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "mindepth":
        case "minDepth": return target.getMinDepth();
        case "move": return target.getMove();
        case "moveexisting":
        case "moveExisting": return target.getMoveExisting();
        case "moveexistingfilestrategy":
        case "moveExistingFileStrategy": return target.getMoveExistingFileStrategy();
        case "movefailed":
        case "moveFailed": return target.getMoveFailed();
        case "noop": return target.isNoop();
        case "oncompletionexceptionhandler":
        case "onCompletionExceptionHandler": return target.getOnCompletionExceptionHandler();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "premove":
        case "preMove": return target.getPreMove();
        case "presort":
        case "preSort": return target.isPreSort();
        case "probecontenttype":
        case "probeContentType": return target.isProbeContentType();
        case "processstrategy":
        case "processStrategy": return target.getProcessStrategy();
        case "readlock":
        case "readLock": return target.getReadLock();
        case "readlockcheckinterval":
        case "readLockCheckInterval": return target.getReadLockCheckInterval();
        case "readlockdeleteorphanlockfiles":
        case "readLockDeleteOrphanLockFiles": return target.isReadLockDeleteOrphanLockFiles();
        case "readlockidempotentreleaseasync":
        case "readLockIdempotentReleaseAsync": return target.isReadLockIdempotentReleaseAsync();
        case "readlockidempotentreleaseasyncpoolsize":
        case "readLockIdempotentReleaseAsyncPoolSize": return target.getReadLockIdempotentReleaseAsyncPoolSize();
        case "readlockidempotentreleasedelay":
        case "readLockIdempotentReleaseDelay": return target.getReadLockIdempotentReleaseDelay();
        case "readlockidempotentreleaseexecutorservice":
        case "readLockIdempotentReleaseExecutorService": return target.getReadLockIdempotentReleaseExecutorService();
        case "readlocklogginglevel":
        case "readLockLoggingLevel": return target.getReadLockLoggingLevel();
        case "readlockmarkerfile":
        case "readLockMarkerFile": return target.isReadLockMarkerFile();
        case "readlockminage":
        case "readLockMinAge": return target.getReadLockMinAge();
        case "readlockminlength":
        case "readLockMinLength": return target.getReadLockMinLength();
        case "readlockremoveoncommit":
        case "readLockRemoveOnCommit": return target.isReadLockRemoveOnCommit();
        case "readlockremoveonrollback":
        case "readLockRemoveOnRollback": return target.isReadLockRemoveOnRollback();
        case "readlocktimeout":
        case "readLockTimeout": return target.getReadLockTimeout();
        case "recursive": return target.isRecursive();
        case "renameusingcopy":
        case "renameUsingCopy": return target.isRenameUsingCopy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "shuffle": return target.isShuffle();
        case "sortby":
        case "sortBy": return target.getSortBy();
        case "sorter": return target.getSorter();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "startingdirectorymustexist":
        case "startingDirectoryMustExist": return target.isStartingDirectoryMustExist();
        case "startingdirectorymusthaveaccess":
        case "startingDirectoryMustHaveAccess": return target.isStartingDirectoryMustHaveAccess();
        case "synchronous": return target.isSynchronous();
        case "tempfilename":
        case "tempFileName": return target.getTempFileName();
        case "tempprefix":
        case "tempPrefix": return target.getTempPrefix();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }
}

