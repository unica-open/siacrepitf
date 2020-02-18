# Configurations
All configuration MUST be set in the `buildfiles/<env>.properties` file used for compilation
- current.env = the currently executing environment
- nome.ambiente = the name of the environment
- datasource.jndi-url = no more used. May be left to blank or to a default value
- messageSources.cacheSeconds = no more used. May be left to -1
- flag-debug = the Java compiler flag to activate debug symbols (on/off)
- jpaVendorAdapter.showSql = no more used
- remincl.resource.provider = URL to the remote resources
- remincl.cache.time = caching time for the remote resources (default: 8 hours)
- portal.home = portal home for the logout
- sso.filter.name = Name for the SSO filter
- sso.filter.url.pattern = URL pattern for the SSO filter
    (specify a non-existing extension to prevent SSO checks)
- sso.loginHandler = fully-qualified class name for the SSO handler
- urlServerParacadute = URL for SSOBart implementation (unused)
- edu.yale.its.tp.cas.client.filter.serverName = SSOBart server (unused)
- edu.yale.its.tp.cas.client.filter.validateUrl = SSOBart validation url (unused)
- ssobart.java.naming.provider.url = SSOBart naming provider (unused)
- ssobart.multi = SSOBart parameter (unused)
- endpoint.url.service.core = Endpoint for the COR backend service
- datasource.url = No more used
- datasource.user = No more used
- datasource.password = No more used
- birt.working.folder = No more used
