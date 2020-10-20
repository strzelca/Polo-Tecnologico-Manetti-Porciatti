from InternetRequest.get import UrlElements

if __name__ == '__main__':
    data = UrlElements("https://ifconfig.co/ip")
    data.print_status()
    data.get()